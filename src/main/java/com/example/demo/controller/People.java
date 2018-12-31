package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("people")
public class People {
    @RequestMapping("getName")
    public String getName() {
        return "Hello World";
    }
}
