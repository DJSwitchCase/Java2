package ru.mirea.practice14.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.mirea.practice14.Game;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/games")
public class GameController {
    List<Game> games;

    public GameController() {
        this.games = new ArrayList<>();
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Game> getGames() {
        return games;
    }

    @RequestMapping("/add")
    public Object addGame(@RequestParam(value="name")String newName, @RequestParam(value="date")String date){
        games.add(new Game(newName, date));
        return games;
    }
}
 