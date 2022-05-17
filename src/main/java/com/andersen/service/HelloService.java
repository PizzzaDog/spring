package com.andersen.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    public String getHelloWorld() {
        return "Hello World";
    }
}
