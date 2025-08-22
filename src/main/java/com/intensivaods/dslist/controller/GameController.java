package com.intensivaods.dslist.controller;

import com.intensivaods.dslist.dto.GameDto;
import com.intensivaods.dslist.dto.GameMinDto;
import com.intensivaods.dslist.repository.GameRepository;
import com.intensivaods.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/games")
public class GameController {


    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameMinDto> findAll() {
        List<GameMinDto> result = gameService.findAllGames();
        return result;
    }

    @GetMapping("/{id}")
    public GameDto findById(@PathVariable Long id){
       GameDto result =  gameService.findById(id);
        return result;
    }

}
