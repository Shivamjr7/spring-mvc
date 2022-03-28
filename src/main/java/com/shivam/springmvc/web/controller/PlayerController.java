package com.shivam.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PlayerController {

    @RequestMapping(value = "/v1/player" , method = RequestMethod.GET)
    public String showPlayerForm(Model model)
    {

        model.addAttribute("player" , "Shivam Jari");
        model.addAttribute("id", 1);

        return "player-new";

    }

    @RequestMapping(value = "/v2/player" , method = RequestMethod.GET)
    public ModelAndView showPlayerForm()
    {

        List<String> players = new ArrayList<>(Arrays.asList("Shivam","Jari"));
        ModelAndView modelAndView  = new ModelAndView();

        modelAndView.addObject("player","Bruno");
        modelAndView.addObject("id","23");
        modelAndView.addObject("list",players);
        modelAndView.setViewName("player-v2");
        return modelAndView;

    }

}
