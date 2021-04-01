package com.redbeet.whatI.gReview;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redbeet.whatI.game.GameDAO;
import com.redbeet.whatI.game.GameDTO;

@Service
public class GReviewService {

	@Autowired
	private GReviewDAO gReviewDAO;
	
	@Autowired
	private GameDAO gameDAO;
	
	public List<GReviewDTO> gReviewList(GReviewDTO gReviewDTO) throws Exception {
		return gReviewDAO.gReviewList(gReviewDTO);
	}
	
	public int newGReview(GReviewDTO gReviewDTO) throws Exception {
		int result = gReviewDAO.newGReview(gReviewDTO);
		result = gReviewDAO.updateRate(gReviewDTO);
		return result;
	}
	
	public int gReviewDelete(GReviewDTO gReviewDTO) throws Exception {
		gReviewDTO = gReviewDAO.gReviewSelect(gReviewDTO);
		int result = gReviewDAO.gReviewDelete(gReviewDTO);
		result = gReviewDAO.updateRate(gReviewDTO);
		return result;
	}
}
