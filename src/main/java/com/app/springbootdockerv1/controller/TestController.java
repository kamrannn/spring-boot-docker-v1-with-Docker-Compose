package com.app.springbootdockerv1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    @GetMapping("/test")
    public String home1() {
        return "Hello Docker World test API";
    }
}
