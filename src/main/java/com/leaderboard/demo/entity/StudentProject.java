package com.leaderboard.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data

public class StudentProject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Project project;

    private boolean isDeleted;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
