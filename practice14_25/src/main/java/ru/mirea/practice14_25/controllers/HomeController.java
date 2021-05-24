package ru.mirea.practice14_25.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }
}
