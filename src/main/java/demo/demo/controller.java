package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.git springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/shopping")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
