package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.SignUpRequestDto;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public User signUp(@RequestBody SignUpRequestDto signUpRequestDto) {
        return userService.signUp(signUpRequestDto.getEmail(), signUpRequestDto.getPassword());
    }


    @PostMapping("/signin")
    public boolean signIn(@RequestBody SignUpRequestDto signUpRequestDto) {
        return userService.signIn(signUpRequestDto.getEmail(), signUpRequestDto.getPassword());
    }

}
