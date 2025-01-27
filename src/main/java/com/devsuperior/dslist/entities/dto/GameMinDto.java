package com.devsuperior.dslist.entities.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;


public class GameMinDto {
	
	
	private long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;


	GameMinDto(){
		
	}

	public GameMinDto(GameMinProjection projection) {

		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getGameYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
		
	}
	
	public GameMinDto(Game entity) {

		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
		
	}


	public long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Integer getYear() {
		return year;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
