package org.example.splitwise.services;

import org.example.splitwise.models.Group;
import org.example.splitwise.models.User;
import org.example.splitwise.repository.GroupRepository;
import org.example.splitwise.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private final UserRepository userRepository;
    private final GroupRepository groupRepository;

    public GroupService(UserRepository userRepository, GroupRepository groupRepository) {
        this.userRepository = userRepository;
        this.groupRepository = groupRepository;
    }

    public Group createGroup(String name, List<Long> userIds) {
        List<User> users = userRepository.findAllById(userIds);

        // Users requested, vs the users found in the DB
        if (userIds.size() != users.size()) {
            throw new IllegalArgumentException("Users are invalid.");
        }

        Group group = new Group(name, users);

        return groupRepository.save(group);
    }
}
