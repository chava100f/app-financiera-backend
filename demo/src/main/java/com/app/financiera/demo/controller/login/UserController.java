package com.app.financiera.demo.controller.login;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {

    @GetMapping("/profile")
    public ResponseEntity<String> dashboard() {
        return new ResponseEntity<>("User profile!", HttpStatus.OK);
    }

}
