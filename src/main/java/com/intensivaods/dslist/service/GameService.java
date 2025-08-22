package com.intensivaods.dslist.service;

import com.intensivaods.dslist.dto.GameDto;
import com.intensivaods.dslist.dto.GameMinDto;
import com.intensivaods.dslist.entities.Game;
import com.intensivaods.dslist.projection.GameMinProjection;
import com.intensivaods.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameMinDto> findAllGames(){
        List <Game> games = gameRepository.findAll();
        List <GameMinDto> dtoResult = games.stream().map( x -> new GameMinDto(x)).collect(Collectors.toList());
        return dtoResult;
    }

    @Transactional(readOnly = true)
    public  GameDto findById(Long id){
        return gameRepository.findById(id).
                map(x -> new GameDto(x)).orElseThrow(() -> new  IllegalArgumentException("Game not found"));
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId){
        List<GameMinDto> result = gameRepository.searchByList(listId).stream().
                map(x -> new GameMinDto(x)).toList();
        return result;
    }
}
