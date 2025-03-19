package org.example.splitwise.repository;

import org.example.splitwise.models.Expense;
import org.example.splitwise.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExpenseRepository extends
        JpaRepository<Expense, Long> {

    List<Expense> findAllByGroup(Group group);
}