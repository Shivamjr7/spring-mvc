package com.shivam.springmvc.service.impl;

import com.shivam.springmvc.model.Game;
import com.shivam.springmvc.repository.GameRepository;
import com.shivam.springmvc.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRespository;

    @Override
    public List<Game> listOfGames() {
        List<Game> games = gameRespository.findAll();
        return games;
    }

    @Override
    public void createGame(Game game) {
        gameRespository.save(game);
    }

    @Override
    public void deleteGame(long id) {
        gameRespository.deleteById(id);
    }

    @Override
    public Game getGame(long id) {
        return gameRespository.getById(id);
    }
}
