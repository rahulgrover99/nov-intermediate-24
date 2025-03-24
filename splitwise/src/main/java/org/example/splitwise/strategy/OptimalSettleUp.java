package org.example.splitwise.strategy;

import org.example.splitwise.models.Expense;
import org.example.splitwise.models.User;
import org.example.splitwise.models.UserExpense;

import java.util.*;

/**
 *
 * Steps to settle up expenses
 *
 * 1. For each user find out the amount they need to pay or get back.
 * 2. Create 2 PQs. 1 with Max Paying to, 1 with Max Receiving
 * 3. Match the biggest ones, settle one of them
 *
 */

public class OptimalSettleUp implements SettleUpStrategy{
    @Override
    public List<Transaction> settleUp(List<Expense> expenses) {

        Map<User, Double> owings = getOwings(expenses);

        // { user1: 1000, user2: -700, user3: -400, user4: 100 }

        PriorityQueue<UserExpense> lender = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<UserExpense> borrower = new PriorityQueue<>(Collections.reverseOrder());

        owings.forEach((user, amount) -> {
            if (amount < 0) {
                borrower.add(new UserExpense(user, -amount.intValue()));
            } else {
                lender.add(new UserExpense(user, amount.intValue()));
            }
        });


        // PQ PAID BY: [(user1, 1000), (user4, 100)]
        // PQ OWED BY: [(user2, 700), (user3, 400)]

        List<Transaction> transactions = new ArrayList<>();
        while(!lender.isEmpty()) {
            UserExpense topLender = lender.poll();
            UserExpense topBorrower = borrower.poll();

            // Lender > Borrower ->(user1, 1000) (user2, 700)
            // user2 -> user1 (700)
            // lenders -> (user1, 300)
            if (topLender.getAmount() > topBorrower.getAmount()) {
                transactions.add(
                        new Transaction(topBorrower.getAmount(),
                                topBorrower.getUser(), topLender.getUser()));
                lender.add(new UserExpense(topLender.getUser(),
                        topLender.getAmount() - topBorrower.getAmount()));
            } else if (topLender.getAmount() == topBorrower.getAmount()) {
                transactions.add(
                        new Transaction(topBorrower.getAmount(),
                                topBorrower.getUser(), topLender.getUser()));
            } else {
                // Lender < Borrower ->(user1, 700) (user2, 1000)
                // user2 -> user1 (700)
                // borrowers-> (user2, 300)
                transactions.add(
                        new Transaction(topLender.getAmount(),
                                topBorrower.getUser(), topLender.getUser()));
                borrower.add(new UserExpense(topBorrower.getUser(),
                        topBorrower.getAmount() - topLender.getAmount()));
            }
        }

        return transactions;
    }

    private static Map<User, Double> getOwings(List<Expense> expenses) {
        Map<User, Double> owings = new HashMap<>();

        for (Expense expense: expenses) {
            for (UserExpense userExpense: expense.getPaidBy()) {

                // If user not in the map, add the user.
                if (!owings.containsKey(userExpense.getUser())) {
                    owings.put(userExpense.getUser(), 0.0);
                }

                // Update the amount for the user.
                owings.put(userExpense.getUser(),
                        owings.get(userExpense.getUser()) + userExpense.getAmount());

            }

            for (UserExpense userExpense: expense.getOwedBy()) {

                // If user not in the map, add the user.
                if (!owings.containsKey(userExpense.getUser())) {
                    owings.put(userExpense.getUser(), 0.0);
                }

                // Update the amount for the user.
                owings.put(userExpense.getUser(),
                        owings.get(userExpense.getUser()) + userExpense.getAmount());

            }
        }
        return owings;
    }
}
