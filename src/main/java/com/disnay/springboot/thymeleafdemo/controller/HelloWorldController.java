package com.disnay.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    // need a controller method to read form data and add data to the model
    @RequestMapping("/processFormVersion2")
    public String letsShoutDude(HttpServletRequest request, Model model){

        //read the request parameter from HTML form
        String theName = request.getParameter("studentName");
        //convert the data to all caps
        theName = theName.toUpperCase();
        //create message
        String result = "Yo " + theName;
        // message to the model
        model.addAttribute("message",result);
        return "helloword";
        //test123
    }
}
