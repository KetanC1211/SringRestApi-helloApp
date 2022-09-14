package com.example.myfirstspringbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestApi {

    @RequestMapping("/hello")
    public String printHello() {
        return "hello world trying requesting Mapping";
    }
}
