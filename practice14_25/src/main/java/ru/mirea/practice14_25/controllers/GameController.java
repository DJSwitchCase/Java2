package ru.mirea.practice14_25.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.mirea.practice14_25.model.Game;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/games")
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

    @GetMapping("/del")
    @ResponseBody
    public String delGame(@RequestParam(value="name")String newName) {
        for (Game game : games)
        {
            if (game.getName().equals(newName))
            {
                games.remove(game);
                return newName + " deleted successfully";
            }
        }
        return newName + " not found";
    }

    @RequestMapping("/add")
    @ResponseBody
    public Object addGame(@RequestParam(value="name")String newName, @RequestParam(value="date")String date){
        Game x = new Game(newName, date);
        games.add(x);
        return x;
    }
}
