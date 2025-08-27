package com.vijay.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/service2") 
public class HelloController {

    @GetMapping
    public String root() {
        return "Service2 root endpoint is alive!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Wednesday Fargate Deployment for SERVICE TWO... UPDATED";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "SERVICE TWO... Second MAPPING...";
    }
}
