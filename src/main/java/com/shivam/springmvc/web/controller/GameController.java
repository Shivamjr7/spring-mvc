package com.shivam.springmvc.web.controller;

import com.shivam.springmvc.model.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/v1")
public class GameController {


    @GetMapping(value = "/games")
    public String listOfGames(Model model)
    {

        List<Game> list = new ArrayList<>();
        Game fifa = new Game();
        fifa.setName("FIFA");
        fifa.setId(123L);
        fifa.setPrice(100);

        list.add(fifa);

        model.addAttribute("games",list);
        return "games";
    }


    @GetMapping(value = "/games/add")
    public String addGames()
    {

        return "games-add";
    }

}
