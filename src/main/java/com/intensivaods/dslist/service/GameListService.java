package com.intensivaods.dslist.service;


import com.intensivaods.dslist.dto.GameListDto;
import com.intensivaods.dslist.entities.GameList;
import com.intensivaods.dslist.repository.GameListRepository;
import com.intensivaods.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAllList(){
        List <GameListDto> list = gameListRepository.findAll().stream()
                .map( x -> new GameListDto(x)).collect(Collectors.toList());
        return list;
    }

    @Transactional(readOnly = true)
    public GameListDto findByIdList(Long id){
        GameListDto listadto = gameListRepository.findById(id).
                map( X -> new GameListDto(X)).orElseThrow(() -> new IllegalArgumentException("Not Found List"));
        return  listadto;
    }

}
