package com.disnay.springboot.thymeleafdemo.controller;

import com.disnay.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
    public class StudentController{
        public String showForm(Model theModel){
            //create a new student Object
            Student theStudent = new Student();
            //add Student Object to the model
            theModel.addAttribute("student",theStudent);

            return "student-form";
        }
        @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
            //log the input data
            System.out.printf("theStudent " + theStudent.getFirstName() + " " + theStudent.getLastName());

            return "student-confirmation";
        }
    }

