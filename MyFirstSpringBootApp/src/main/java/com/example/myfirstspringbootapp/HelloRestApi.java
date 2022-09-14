package com.example.myfirstspringbootapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestApi {
    @RequestMapping("/hello")
    public String printHello() {
        return "hello world trying requesting Mapping";
    }
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String Name){
        return "Hello " + Name+ " from BridgeLabs.";
    }
    @RequestMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello "+name+ " from BridgeLabs.";
    }
    @PostMapping ("/post")
    public String printMsg (@RequestBody User u){
        return "Hello "+u.getFirstName()+" "+u.getLastName()+ " from BridgeLabs.";
    }

}