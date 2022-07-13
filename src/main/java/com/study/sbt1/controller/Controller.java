package com.study.sbt1.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String home(){
        return "Home";
    }

    @GetMapping("/view")
    public String view(){
        return "view";
    }


}
