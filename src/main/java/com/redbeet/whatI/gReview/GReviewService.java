package com.redbeet.whatI.gReview;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GReviewService {

	@Autowired
	private GReviewDAO gReviewDAO;
	
	public List<GReviewDTO> gReviewList(GReviewDTO gReviewDTO) throws Exception {
		return gReviewDAO.gReviewList(gReviewDTO);
	}
	
	public int newGReview(GReviewDTO gReviewDTO) throws Exception {
		int result = gReviewDAO.newGReview(gReviewDTO);
		result = gReviewDAO.updateRate(gReviewDTO);
		return result;
	}
}
