package com.redbeet.whatI.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
	
	@Autowired
	private GameDAO gameDAO;
	
	public List<GameDTO> gameList() throws Exception {
		return gameDAO.gameList();
	}

}
