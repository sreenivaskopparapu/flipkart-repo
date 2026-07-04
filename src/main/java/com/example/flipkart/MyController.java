package com.example.flipkart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Docker World";
    }
}
