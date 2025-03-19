package org.example.splitwise.repository;

import org.example.splitwise.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends
        JpaRepository<User, Long> {
}