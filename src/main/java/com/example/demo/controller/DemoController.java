package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class DemoController {

    @GetMapping
    public String test(){
        System.out.println("test ok!");
        return "test ok!!!";
    }

}
