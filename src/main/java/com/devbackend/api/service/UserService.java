package com.devbackend.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devbackend.api.repository.UserRepository;
import com.devbackend.api.model.User;

import lombok.Data;

@Data
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserById(final Long id) {
        return userRepository.findById(id);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

        public User createUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    public User updateUser(final Long id, User newUser) {
        return userRepository.findById(id)
            .map(user -> {
            user.setNom(newUser.getNom());
            user.setEmail(newUser.getEmail());
            user.setAge(newUser.getAge());
            return userRepository.save(user);
            }).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public User replaceUser(final Long id, User newUser) {
        return userRepository.findById(id)
            .map(user -> {
            user.setNom(newUser.getNom());
            user.setEmail(newUser.getEmail());
            user.setAge(newUser.getAge());
            return userRepository.save(user);
            }).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void deleteUser(final Long id) {
        userRepository.deleteById(id);
    }
}
