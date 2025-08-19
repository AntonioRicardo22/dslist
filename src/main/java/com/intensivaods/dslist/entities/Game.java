package com.intensivaods.dslist.entities;

import jakarta.persistence.*;
import org.hibernate.mapping.PrimaryKey;

import java.util.Objects;

@Entity
@Table(name = "Game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "title", nullable = false, length = 60)
    private String title;
    @Column(name = "game_year", nullable = false)
    private  Integer year;
    @Column(name = "platforms" , nullable = false , length = 60)
    private String platfoorms;
    @Column(name = "score" , nullable = false)
    private Double score;
    @Column (name = "imgUrl" , nullable = false)
    private String imgUrl;
    @Column(name = "shortDescription", nullable = false, length = 100)
    private String shortDescription;
    @Column(name = "longDescription", nullable = false, length = 255)
    private String longDescription;

    public Game(Long id, String title, Integer year, String platfoorms, Double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.platfoorms = platfoorms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Game() {
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPlatforms() {
        return platfoorms;
    }

    public void setPlatfoorms(String platfoorms) {
        this.platfoorms = platfoorms;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
