package org.example.demospringsecurity.controller;

import org.example.demospringsecurity.entity.Users;
import org.example.demospringsecurity.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user) {
        return userService.addUser(user);
    }

}
