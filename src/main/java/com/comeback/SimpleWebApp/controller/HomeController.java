package com.comeback.SimpleWebApp.controller;


/*
This also works

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        System.out.println("I'm running");
        return "Welcome to Ignio!!!";
    }
}


 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return  "Welcome to Ignio You all!!!";
    }


    @RequestMapping("/about")
    public String about(){
        return "If it breaks we are here!!";
    }
}


