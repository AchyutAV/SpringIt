package com.achyut.springit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontoller {

    @GetMapping("/")
    public String home(){
        return "Hello, World";
    }
}
