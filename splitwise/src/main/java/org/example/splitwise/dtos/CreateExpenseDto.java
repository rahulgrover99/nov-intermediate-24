package org.example.splitwise.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class CreateExpenseDto {
    String name;
    int amount;
    Long groupId;
    Map<Long, Integer> paidBy;
    Map<Long, Integer> owedBy;
}
