package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@RestController
public class App 
{
    public static void main( String[] args ) { SpringApplication.run(App.class, args); }

    @GetMapping
    public String get(){
        return "Hello, World!";
    }
}
