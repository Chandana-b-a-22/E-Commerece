package Ecommerce.BlinkitApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.BlinkitApp.entity.User;
import Ecommerce.BlinkitApp.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(User user) {

        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "Email already exists";
        }

        if (userRepository.findByName(user.getName()) != null) {
            return "Username already exists";
        }

        userRepository.save(user);
        return "Registration Successful";
    }
}