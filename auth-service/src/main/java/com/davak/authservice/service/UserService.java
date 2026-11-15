package com.davak.authservice.service;

import com.davak.authservice.model.User;
import com.davak.authservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Dave AKN
 * @version 1.0
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
