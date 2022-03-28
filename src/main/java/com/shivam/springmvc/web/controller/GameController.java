package com.shivam.springmvc.web.controller;

import com.shivam.springmvc.model.Game;
import com.shivam.springmvc.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/v1")
public class GameController {


    @Autowired
    private GameService gameService;


    @GetMapping(value = "/games")
    public String displayGames(Model model) {
        List<Game> gamesList = gameService.listOfGames();
        model.addAttribute("games", gamesList);
        return "games";
    }


    @GetMapping(value = "/games/add")
    public String toAddGamePage(Model model) {

        model.addAttribute("game", Game.builder().build());
        return "create-game";
    }


    @PostMapping(value = "/games/create")
    public String addGame(@ModelAttribute Game game) {
        gameService.createGame(game);
        return "redirect:/v1/games";
    }


    @GetMapping(value = "/games/delete")
    public String deleteGame(@RequestParam long id)
    {
        gameService.deleteGame(id);
        return "redirect:/v1/games";
    }


    @GetMapping(value = "/games/update")
    public String toUpdateGame(@RequestParam long id , Model model)
    {
        Game game = gameService.getGame(id);
        System.out.println("in update : "+ game);
        model.addAttribute("game",game);

        return "create-game";

    }


}
