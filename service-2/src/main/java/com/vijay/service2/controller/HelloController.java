package com.vijay.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/service2") 
public class HelloController {

    @GetMapping("/")
    public String root() {
        return "Root Method from Service2";
    }

    @GetMapping("/health")
    public String health() {
        return "Health Method from Service2";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Method from Service2";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "Hello2 Method from Service2";
    }
}
