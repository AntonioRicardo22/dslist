package com.intensivaods.dslist.entities;

import jakarta.persistence.*;
import org.hibernate.mapping.PrimaryKey;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "genre", nullable = false)
    private String genre;
    @Column(name = "game_year", nullable = false)
    private  Integer year;
    @Column(name = "platform" , nullable = false)
    private String platform;
    @Column(name = "score" , nullable = false)
    private Double score;
    @Column (name = "imgUrl" , nullable = false)
    private String imgUrl;
    @Column(name = "shortDescription", nullable = false)
    private String shortDescription;
    @Column(name = "longDescription", nullable = false, columnDefinition = "TEXT")
    private String longDescription;

    public Game() {
    }

    public Game(Long id, String title, String genre, Integer year, String platform, Double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.platform = platform;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
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

    public void setPlatform(String platfoorms) {
        this.platform = platfoorms;
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
