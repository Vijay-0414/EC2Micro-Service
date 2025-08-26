package com.vijay.service3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Tuesday Fargate Deployment from Service 3 update Checking...";
    }
}
