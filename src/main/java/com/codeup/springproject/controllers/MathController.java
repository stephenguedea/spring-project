package com.codeup.springproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @ResponseBody
    @GetMapping("/add/{num1}/and/{num2}")
    public int add(@PathVariable int num1, @PathVariable int num2){
        return num1 + num2;
    }

    @ResponseBody
    @GetMapping("/subtract/{num1}/and/{num2}")
    public int subtract(@PathVariable int num1, @PathVariable int num2){
        return num1 - num2;
    }

    @ResponseBody
    @GetMapping("/multiply/{num1}/and/{num2}")
    public int multiply(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }

    @ResponseBody
    @GetMapping("/divide/{num1}/and/{num2}")
    public int divide(@PathVariable int num1, @PathVariable int num2){
        return num1 / num2;
    }

}
