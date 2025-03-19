package org.example.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "splitwise_groups")
@AllArgsConstructor
@NoArgsConstructor
public class Group extends BaseModel{
    String name;
    @ManyToMany
    List<User> user;

}
