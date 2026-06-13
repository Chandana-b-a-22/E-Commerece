package Ecommerce.BlinkitApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import Ecommerce.BlinkitApp.entity.User;
import Ecommerce.BlinkitApp.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public String saveUser(User user, Model model) {

        String message = userService.registerUser(user);

        if (message.equals("Registration Successful")) {
            return "redirect:/login";
        }

        model.addAttribute("msg", message);
        return "register";
    }
}