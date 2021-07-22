package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/","index","222ddd"})
    public  String index(){
        return "index";
    }

    @RequestMapping("demo2")
    public  String demo(){
        return "demo2";
    }
}
