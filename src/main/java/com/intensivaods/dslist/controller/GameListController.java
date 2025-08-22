package com.intensivaods.dslist.controller;

import com.intensivaods.dslist.dto.GameListDto;
import com.intensivaods.dslist.dto.GameMinDto;
import com.intensivaods.dslist.service.GameListService;
import com.intensivaods.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    GameListService gameListService;
    @Autowired
    GameService gameService;

    @GetMapping
    public List <GameListDto> findAllLists(){
        List<GameListDto> gameListDto = gameListService.findAllList();
        return  gameListDto;
    }

    @GetMapping ("/{id}/games")
    public List<GameMinDto> findByList(@PathVariable Long id){
        List<GameMinDto> result = gameService.findByList(id);
        return result;
    }


    @GetMapping ("/{id}")
    public GameListDto findByIdList(@PathVariable long id){
        GameListDto byIdList = gameListService.findByIdList(id);
        return byIdList;
    }
}
