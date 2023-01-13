package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping
public class HelloModelController {
    @GetMapping("model")
    public String HelloViewe(Model model){
        model.addAttribute("msg", "Thymeleaf!!");
        return "helloThymeleaf";
    }
}
