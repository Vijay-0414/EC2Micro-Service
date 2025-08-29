package com.vijay.service3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/service3") 
public class HelloController {

    @GetMapping("/")
    public String root() {
        return "Root Method from Service3";
    }

    @GetMapping("/health")
    public String health() {
        return "Health Method from Service3";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Method from Service3";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "Hello2 Method from Service3";
    }
}
