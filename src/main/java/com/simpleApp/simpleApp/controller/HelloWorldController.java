package com.simpleApp.simpleApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Good Morning Nikiluuuu, Wake Up!. Gym Jaabo aase!";
    }
}
