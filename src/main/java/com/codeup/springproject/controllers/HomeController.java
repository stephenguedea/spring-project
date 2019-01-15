package com.codeup.springproject.controllers;

import com.codeup.springproject.quotes.Quote;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    // make a mapping w GetMapping
    @GetMapping("/home")
    public String home(Model model){
        int number = (int) Math.floor(Math.random() * 200 + 1);
        model.addAttribute("number", number);


        Quote[] quotes = Quote.getAllQuotes();
        model.addAttribute("number", number);
        model.addAttribute("quotes", quotes);
        return "home";
    }

    @ResponseBody // only necessary if your're returning a string / number
    public String home(){
        return "This is the landing page!";
    }
}
