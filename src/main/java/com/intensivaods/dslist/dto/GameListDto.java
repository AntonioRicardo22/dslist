package com.intensivaods.dslist.dto;

import com.intensivaods.dslist.entities.GameList;
import org.jetbrains.annotations.NotNull;

public class GameListDto {

    private Long id;
    private String name;



    public GameListDto(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
