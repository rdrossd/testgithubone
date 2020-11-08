package com.testgithubone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        // the string index will be looked for in src/main/resources/templates
        return "index";
    }
}

