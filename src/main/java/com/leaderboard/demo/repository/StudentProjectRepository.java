package com.leaderboard.demo.repository;

import com.leaderboard.demo.entity.StudentProject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface StudentProjectRepository extends JpaRepository<StudentProject, UUID> {
    List<StudentProject> findByStudentId(UUID studentId);
}
