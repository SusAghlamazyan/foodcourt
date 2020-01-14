package com.beat.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

@RequestMapping(value = "/firstRequest", method = RequestMethod.GET )
    public String firstFunction(){
    System.out.println("safdsfd");
    return "sddsda";
    }
}
