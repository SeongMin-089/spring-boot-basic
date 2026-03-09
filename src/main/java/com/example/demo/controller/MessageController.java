package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/hi")
    public String hi(){
        return "hi spring boot!";
    }

    @GetMapping("/bye")
    public String bye(){
        return "bye bye!";
    }
}
