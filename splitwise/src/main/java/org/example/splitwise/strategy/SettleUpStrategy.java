package org.example.splitwise.strategy;

import org.example.splitwise.models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    List<Transaction> settleUp(List<Expense> expenses);

}
