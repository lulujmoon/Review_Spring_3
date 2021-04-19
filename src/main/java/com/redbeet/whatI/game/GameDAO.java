package com.redbeet.whatI.game;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.redbeet.whatI.gReview.GReviewDTO;

@Repository
public class GameDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.redbeet.whatI.game.GameDAO.";

	public List<GameDTO> gameList() throws Exception {
		return sqlSession.selectList(NAMESPACE+"gameList");
	}
	
	public int gameInsert(GameDTO gameDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"gameInsert", gameDTO);
	}
	
	public GameDTO gameSelect(GameDTO gameDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"gameSelect", gameDTO);
	}
	
	public GameDTO getRate(GReviewDTO gReviewDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getRate", gReviewDTO);
	}
}