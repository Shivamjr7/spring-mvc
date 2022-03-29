package com.shivam.springmvc.service;

import com.shivam.springmvc.model.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GameService {
    List<Game> listOfGames();
    void createGame(Game game);
    void deleteGame(long id);

    Game getGame(long id);
}
