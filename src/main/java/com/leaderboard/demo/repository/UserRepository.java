package com.leaderboard.demo.repository;

import com.leaderboard.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    List<User> findByIsDeletedFalse();
    List<User> findByRoleName(String roleName);  // Fetch users based on role (e.g., "MENTOR", "STUDENT")
    List<User> findByCollegeId(UUID collegeId);  // Fetch all users in a specific college
    Optional<User> findByEmail(String email);  // Find user by email (useful for login/authentication)

    default Optional<User> findByEmail(String email) {
        return null;
    }

}
