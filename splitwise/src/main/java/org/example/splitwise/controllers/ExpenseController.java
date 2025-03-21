package org.example.splitwise.controllers;

import org.example.splitwise.dtos.CreateExpenseDto;
import org.example.splitwise.models.Expense;
import org.example.splitwise.services.ExpenseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("expenses")
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public Expense createExpense(@RequestBody CreateExpenseDto createExpenseDto) {
        return expenseService.createExpense(createExpenseDto);
    }
}
