package com.disnay.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    // controller to show a initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    // controller to process form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
}
