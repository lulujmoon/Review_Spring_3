package com.redbeet.whatI.gReview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.redbeet.whatI.game.GameDAO;
import com.redbeet.whatI.game.GameDTO;
import com.redbeet.whatI.game.GameService;

@Controller
@RequestMapping(value="/gReview/")
public class gReviewController {

	@Autowired
	private GReviewService gReviewService;
	
	@Autowired
	private GameService gameService;
	
	@RequestMapping(value="newGReview")
	public void newReview(GReviewDTO gReviewDTO, Model model) throws Exception {
		long num = gReviewDTO.getGame_num();
		GameDTO gameDTO = new GameDTO();
		gameDTO.setNum(num);
		gameDTO = gameService.gameSelect(gameDTO);
		model.addAttribute("game", gameDTO);
	}
	
	@RequestMapping(value="newGReview", method=RequestMethod.POST)
	public String newReview(GReviewDTO gReviewDTO) throws Exception {
		int result = gReviewService.newGReview(gReviewDTO);
		return "redirect:../game/gameList";
	}
	
	@RequestMapping(value="gReviewDelete")
	public String gReviewDelete(GReviewDTO gReviewDTO) throws Exception {
		int result = gReviewService.gReviewDelete(gReviewDTO);
		return "redirect:../game/gameList";
	}
}
