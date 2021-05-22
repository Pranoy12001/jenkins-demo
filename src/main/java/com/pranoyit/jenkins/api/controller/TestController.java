package com.pranoyit.jenkins.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String getMessage() {
        return "Welcome home";
    }
}
