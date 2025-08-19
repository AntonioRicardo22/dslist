package com.intensivaods.dslist.repository;

import com.intensivaods.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GameRepository extends JpaRepository <Game , Long>{


}
