package com.example.myfirstspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstSpringBootAppApplication.class, args);
        System.out.println("hello World");
    }

}
