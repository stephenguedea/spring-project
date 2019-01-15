package com.codeup.springproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeControllerWithThymeleaf {

    @GetMapping("/") // the piece of URL we're listening for
    public String welcome(){
        return "home";
    }
}
// NOTE: there's no @ResponseBody annotation