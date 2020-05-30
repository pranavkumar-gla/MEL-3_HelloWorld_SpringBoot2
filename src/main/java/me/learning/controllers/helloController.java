package me.learning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api2")
public class helloController {

    @RequestMapping("/sayHello2")
    @ResponseBody
    public String sayHello(){
        return "Hello World from Spring boot application - https://start.spring.io/ build";
    }
}
