package org.example.splitwise.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Expense extends BaseModel{
    @ManyToOne
    @JoinColumn(name = "group_id")
    Group group;

    String name;

    int amount;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "expense")
    List<UserExpense> paidBy;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "expense")
    List<UserExpense> owedBy;


}
