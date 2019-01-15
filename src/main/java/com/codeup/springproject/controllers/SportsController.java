package com.codeup.springproject;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class SportsController {
    static ArrayList<String> teams = new ArrayList<>();

    @RequestMapping("/sports")
    public String index(Model model){
//        teams.add("Dallas Cowboys");
//        teams.add("San Antonio Spurs");
//        teams.add("Boston Red Sox");
        // passing data
        model.addAttribute("myTitle", "A List of Sports Team"); // passing a string
        model.addAttribute("teams", teams); // passing an array list
        return "sports/sportsIndex";
    }

    // allow user to add a team
    @RequestMapping(value = "/sports/add", method = RequestMethod.GET)
    public String displayAddSportsTeam(Model model){
        model.addAttribute("title", "Add a Team");
        return "sports/addSportsTeam";
    }

    // create handler to process the form
    // and getting data out of the request

    @RequestMapping(value = "/sports/add", method = RequestMethod.POST)
    public String processAddTeamForm(@RequestParam String teamName){
        teams.add(teamName);

        // Redirect to /sports
        return "redirect:";
    }
}
