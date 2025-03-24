package org.example.splitwise.services;

import org.example.splitwise.dtos.CreateExpenseDto;
import org.example.splitwise.models.Expense;
import org.example.splitwise.models.Group;
import org.example.splitwise.models.User;
import org.example.splitwise.models.UserExpense;
import org.example.splitwise.repository.ExpenseRepository;
import org.example.splitwise.repository.GroupRepository;
import org.example.splitwise.repository.UserExpenseRepository;
import org.example.splitwise.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class ExpenseService {

    private final UserRepository userRepository;
    private final GroupRepository groupRepository;
    private final ExpenseRepository expenseRepository;
    private final UserExpenseRepository userExpenseRepository;

    public ExpenseService(UserRepository userRepository, GroupRepository groupRepository, ExpenseRepository expenseRepository, UserExpenseRepository userExpenseRepository) {
        this.userRepository = userRepository;
        this.groupRepository = groupRepository;
        this.expenseRepository = expenseRepository;
        this.userExpenseRepository = userExpenseRepository;
    }


    @Transactional
    public Expense createExpense(CreateExpenseDto createExpenseDto) {


        // Group to which the expense is attached to.
        Optional<Group> groupOptional = groupRepository.findById(createExpenseDto.getGroupId());


        // Creates a corresponding expense object


        // Finds out who all paid
        List<UserExpense> paidByUserExpenses = new ArrayList<>();
        for (Map.Entry<Long, Integer> entry: createExpenseDto.getPaidBy().entrySet()) {
            Long userId = entry.getKey();
            int amount = entry.getValue();
            User user = userRepository.findById(userId).get();
            UserExpense userExpense = new UserExpense(user, amount);
            paidByUserExpenses.add(userExpense);
        }
        List<UserExpense> paidByUsers = userExpenseRepository.saveAll(paidByUserExpenses);

        // Finds out who all owe
        List<UserExpense> owedByUserExpenses = new ArrayList<>();
        for (Map.Entry<Long, Integer> entry: createExpenseDto.getOwedBy().entrySet()) {
            Long userId = entry.getKey();
            int amount = entry.getValue();
            User user = userRepository.findById(userId).get();
            UserExpense userExpense = new UserExpense(user, -amount);
            owedByUserExpenses.add(userExpense);
        }
        List<UserExpense> owedByUsers = userExpenseRepository.saveAll(owedByUserExpenses);

        // Add entries to the DB.
        Expense expense = Expense.builder()
                .name(createExpenseDto.getName())
                .group(groupOptional.get())
                .amount(createExpenseDto.getAmount())
                .owedBy(owedByUsers).paidBy(paidByUsers)
                .build();

       return expenseRepository.save(expense);

    }
}
