package com.redbeet.whatI.gReview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/gReview/")
public class gReviewController {

	@RequestMapping(value="newGReview")
	public void newReview() throws Exception {
		
	}
}
