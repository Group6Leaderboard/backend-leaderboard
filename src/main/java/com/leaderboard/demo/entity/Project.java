package com.leaderboard.demo.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.apache.catalina.User;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    private String description;
    private int score;

    @ManyToOne
    @JoinColumn(name = "mentor_id")
    private User mentor;

    private boolean isDeleted;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;




}
