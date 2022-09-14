package com.example.myfirstspringbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestApi {

//    @RequestMapping("/hello")
//    public String printHello() {
//        return "hello world trying requesting Mapping";
//    }

    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String Name){
        return "Hello " + Name+ " from BridgeLabs.";
    }



}
