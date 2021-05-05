package ru.mirea.practice14.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class HomeController {
     @GetMapping("/home")
     public String sayHello(){
         return "hello";
     }
}
