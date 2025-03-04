package com.leaderboard.demo.controller;

import com.leaderboard.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {

    @Autowired
    private UserRepository userRepository;

}
