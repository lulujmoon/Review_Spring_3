package com.redbeet.whatI.gReview;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GReviewDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.redbeet.whatI.gReview.GReviewDAO.";
	
	public List<GReviewDTO> gReviewList(GReviewDTO gReviewDTO) throws Exception {
		List<GReviewDTO> ar =  sqlSession.selectList(NAMESPACE+"gReviewList", gReviewDTO);
		return ar;
	}

	public int newGReview(GReviewDTO gReviewDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"newGReview", gReviewDTO);
	}
	
	public int updateRate(GReviewDTO gReviewDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"updateRate", gReviewDTO);
	}
	
	public int gReviewDelete(GReviewDTO gReviewDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"gReviewDelete", gReviewDTO);
	}
	
	public GReviewDTO gReviewSelect(GReviewDTO gReviewDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"gReviewSelect", gReviewDTO);
	}
}
