package com.leaderboard.demo.repository;

import com.leaderboard.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.UUID;


public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findByAssignedToId(UUID userId);
}
