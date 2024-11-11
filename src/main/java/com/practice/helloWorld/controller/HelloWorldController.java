package com.practice.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping("/hola")
    public String Hello(){
        return "<h1>Hola Mundo<h1>";
    }
}
