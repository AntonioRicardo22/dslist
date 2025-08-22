package com.intensivaods.dslist.dto;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.intensivaods.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.BeanUtils;

public class GameDto {

    private Long id;
    private String title;
    private String genre;
    private  Integer year;
    private String platform;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDto (){}

    public GameDto(Game entity) {
        BeanUtils.copyProperties(entity,this);
        // BeanUtils: É uma ferramenta externa para copiar propriedades de um objeto já existente. Funciona em qualquer lugar.
        // necessario ter os getters e setters
        // mas a melhor arbordagem é o uso do LOMBOK - consegue ser ainda melhor!
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
