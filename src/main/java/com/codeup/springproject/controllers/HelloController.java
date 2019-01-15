package com.codeup.springproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
        @ResponseBody
        @GetMapping("/hello/{name}")
        public String hello(@PathVariable String name){
            return "Howdy, " + name + "!";

    }

    @ResponseBody
    @GetMapping("/hello/{first}/{last}")
    public String hello(@PathVariable String first, @PathVariable String last){
        return "Howdy, " + first + " " + last + "!";

    }

    @GetMapping("/hello")
    public String hello(){
            return "hello";
    }
}
