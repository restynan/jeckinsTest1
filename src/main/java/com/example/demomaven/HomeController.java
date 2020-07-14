package com.example.demomaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String getmethod(){
        return "Thank you jescus Hello world welcome to jenkins.............";
    }
}
