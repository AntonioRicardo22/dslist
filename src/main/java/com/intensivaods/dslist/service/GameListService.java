package com.intensivaods.dslist.service;


import com.intensivaods.dslist.dto.GameListDto;
import com.intensivaods.dslist.entities.GameList;
import com.intensivaods.dslist.projection.GameMinProjection;
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

    @Autowired
    GameRepository gameRepository;

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


    @Transactional
    public void move (Long listId, int sourceIndex,int destinationIndex){

        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex,obj);
        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
        for (int i = min; i < max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(),i);
        }
    }

}
