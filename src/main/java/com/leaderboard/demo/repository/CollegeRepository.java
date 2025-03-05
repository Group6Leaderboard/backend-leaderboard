package com.leaderboard.demo.repository;

import com.leaderboard.demo.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CollegeRepository extends JpaRepository<College, UUID> {
}
