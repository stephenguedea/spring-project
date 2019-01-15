package com.codeup.springproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SayHelloController {
    @GetMapping("/greetings/{username}")
    public String sayHello(@PathVariable String username, Model model) {
        model.addAttribute("username", username);
        return "hello";
    }
}
