package com.redbeet.whatI.game;

import static org.junit.Assert.*;

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
	
}
