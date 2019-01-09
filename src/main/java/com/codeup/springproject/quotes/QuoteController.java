package com.codeup.springproject.quotes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class QuoteController {

    @GetMapping("/quotes/random")
    public Quote getRandomQuote() {
        return Quote.getRandomQuote();
    }

    @GetMapping("/quotes")
    public String getAllQuotes(Model model) {
        Quote[] quotes = Quote.getAllQuotes();
        model.addAttribute("quotes", quotes);

        return "quotes";
    }
}
