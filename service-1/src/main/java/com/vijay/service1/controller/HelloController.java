package com.vijay.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/service1") 
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Wednesday Fargate Deployment for SERVICE ONE";
    }
}

