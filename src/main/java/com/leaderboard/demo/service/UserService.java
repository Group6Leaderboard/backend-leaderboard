package com.leaderboard.demo.service;

import com.leaderboard.demo.entity.User;
import com.leaderboard.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllActiveUsers() {
        return userRepository.findByIsDeletedFalse();
    }

    public void softDeleteUser(UUID id) {
        Optional<User> user = userRepository.findById();
        user.ifPresent(u -> {
            u.setDeleted(true);
            u.setUpdatedAt(LocalDateTime.now());
            userRepository.save(u);
        });
    }
}
