package com.app.financiera.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("api/greetings")
public class GreetingController {

    @GetMapping("/hi")
    public ResponseEntity<String> greetings(){

        return new ResponseEntity<>("Hey you, Hi!", HttpStatus.OK);
    }
}
