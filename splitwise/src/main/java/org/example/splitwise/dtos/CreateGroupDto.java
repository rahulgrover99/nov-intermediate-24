package org.example.splitwise.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateGroupDto {
    String name;
    List<Long> userIds;
}
