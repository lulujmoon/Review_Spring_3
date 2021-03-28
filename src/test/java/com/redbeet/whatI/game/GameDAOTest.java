package com.redbeet.whatI.game;

import static org.junit.Assert.*;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.redbeet.whatI.MyAbstractTest;

public class GameDAOTest extends MyAbstractTest{

	@Autowired
	private GameDAO gameDAO;

//	@Test
//	public void gameListTest() throws Exception {
//		List<GameDTO> ar = gameDAO.gameList();
//		assertNotNull(ar);
//	}
	
//	@Test
//	public void gameInsertTest() throws Exception {
//		GameDTO gameDTO = new GameDTO();
//		gameDTO.setTitle("The Sims 4");
//		gameDTO.setDeveloper("the Redwood Shores studio of Maxis");
//		gameDTO.setRate(0.0);
//		
//		String rDate = "2014-09-02";
//		Date d = Date.valueOf(rDate);
//		
//		gameDTO.setRelease_date(d);
//		
//		int result = gameDAO.gameInsert(gameDTO);
//		assertNotEquals(0, result);
//		
//	}
	
}
