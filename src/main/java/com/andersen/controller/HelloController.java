package com.andersen.controller;

import com.andersen.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;


    @GetMapping("/hello")
    public String helloWorld() {
        return helloService.getHelloWorld();
    }
}
