package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@RestController
public class SpringBootController {

    @RequestMapping("/current-date")
    public LocalDate getAllPages() {
        return LocalDate.now();
    }

    @PostMapping("/welcome")
    public String welkom(@RequestBody String name){
        return "Welkom "+ name +"!";
    }
}