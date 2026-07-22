package com.example.flipkart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
