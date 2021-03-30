package com.redbeet.whatI.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redbeet.whatI.gReview.GReviewDAO;
import com.redbeet.whatI.gReview.GReviewDTO;

@Service
public class GameService {
	
	@Autowired
	private GameDAO gameDAO;
	

	public List<GameDTO> gameList() throws Exception {
		return gameDAO.gameList();
	}
	
	public int gameInsert(GameDTO gameDTO) throws Exception {
		return gameDAO.gameInsert(gameDTO);
	}
	
	public GameDTO gameSelect(GameDTO gameDTO) throws Exception {
		return gameDAO.gameSelect(gameDTO);
	}


}
