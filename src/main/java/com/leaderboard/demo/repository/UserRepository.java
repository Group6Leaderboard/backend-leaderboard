package com.leaderboard.demo.repository;

import com.leaderboard.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    default Optional<User> findByEmail(String email) {
        return null;
    }
}
