package com.app.financiera.demo.controller;


import lombok.AllArgsConstructor;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class Dashboardontroller {

    @PostMapping("/demo")
    public ResponseEntity<String> greetings() {

        return new ResponseEntity<>("Hey you, Hi!", HttpStatus.OK);
    }
}
