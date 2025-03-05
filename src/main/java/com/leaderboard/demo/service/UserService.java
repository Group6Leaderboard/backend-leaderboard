package com.leaderboard.demo.service;


import com.leaderboard.demo.entity.User;
import com.leaderboard.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getUserById(UUID id){
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
    }


    public User createUser(User user){
        return userRepository.save(user);
    }


    public User updateUser(UUID id,User updatedUser){
        User existingUser = userRepository.findById(id)
                .orElseThrow(()->new RuntimeException("User not found with ID: "+id));
        existingUser.setPhone(updatedUser.getPhone());
        existingUser.setPassword(updatedUser.getPassword());

        return userRepository.save(existingUser);
    }
    public void deleteUser(UUID id){
        User user =userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not found with ID: "+id));
        user.setDeleted(true);
        userRepository.save(user);
    }
}
