package com.devSuperio.DSList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devSuperio.DSList.dto.GameDTO;
import com.devSuperio.DSList.dto.GameMinDTO;
import com.devSuperio.DSList.entities.Game;
import com.devSuperio.DSList.services.GameService;

@RestController
@RequestMapping(value = "/games" )
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	private GameDTO findById(@PathVariable Long id){
		GameDTO result = gameService.findById(id);
		return result;
	}
	
	@GetMapping
	private List<GameMinDTO> findall(){
		List<GameMinDTO> result = gameService.findall();
		return result;
	}
	
}
