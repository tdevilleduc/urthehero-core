package com.tdevilleduc.urthehero.core.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

//    @ConfigProperty(name = "greeting")
//    private String greeting;

//    public String politeHello(String name){
//        return greeting + " " + name;
//    }

    public String hello(String name){
        return "Hello " + name;
    }
}