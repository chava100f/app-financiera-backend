package com.app.financiera.demo.controller.login;

import com.app.financiera.demo.service.login.IAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @Autowired
    private IAuthService authService;

    @PostMapping("/login")
    public String login() {
        return "Login from public endpoint";
    }

    @PostMapping("/register")
    public String register() {
        return "Register from public endpoint";
    }
}
