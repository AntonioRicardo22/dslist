package com.intensivaods.dslist.service;

import com.intensivaods.dslist.controller.GameController;
import com.intensivaods.dslist.dto.GameMinDto;
import com.intensivaods.dslist.entities.Game;
import com.intensivaods.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<GameMinDto> findAllGames(){
        List <Game> games = gameRepository.findAll();
        List <GameMinDto> dtoResult = games.stream().map( x -> new GameMinDto(x)).collect(Collectors.toList());
        return dtoResult;
    }



}
