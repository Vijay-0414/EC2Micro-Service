package com.vijay.service3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/service3") 
public class HelloController {

    @GetMapping
    public String root() {
        return "Service3 root endpoint is alive!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Thursday Fargate Deployment for SERVICE THREE... UPDATED";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "SERVICE THREE... Second MAPPING...";
    }
}
