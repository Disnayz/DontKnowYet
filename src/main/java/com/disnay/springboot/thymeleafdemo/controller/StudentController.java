package com.disnay.springboot.thymeleafdemo.controller;

import com.disnay.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

    @Controller
    public class StudentController{
        public String showForm(Model theModel){
            //create a new student Object
            Student theStudent = new Student();
            //add Student Object to the model
            theModel.addAttribute("student",theStudent);
            //
            return "student-form";
        }
    }

