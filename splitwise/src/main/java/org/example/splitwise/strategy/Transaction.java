package org.example.splitwise.strategy;

import lombok.Data;
import org.example.splitwise.models.User;

@Data
public class Transaction {

    double amount;
    User paidBy;
    User paidTo;

    public Transaction(double amount, User paidBy, User paidTo) {
        this.amount = amount;
        this.paidBy = paidBy;
        this.paidTo = paidTo;
    }
}
