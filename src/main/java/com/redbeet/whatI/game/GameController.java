package com.redbeet.whatI.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.redbeet.whatI.gReview.GReviewDTO;
import com.redbeet.whatI.gReview.GReviewService;

@Controller
@RequestMapping(value="/game/*")
public class GameController {

	@Autowired
	private GameService gameService;

	@Autowired
	private GReviewService gReviewService;
	
	@RequestMapping(value="gameList")
	public void gameList(Model model) throws Exception {
		List<GameDTO> li = gameService.gameList();
		model.addAttribute("list", li);
	}
	
	@RequestMapping(value="newGame")
	public void newGame() throws Exception {}
	
	@RequestMapping(value="newGame", method= RequestMethod.POST)
	public String newGame(GameDTO gameDTO) throws Exception {
		int result = gameService.gameInsert(gameDTO);
		String re="/game/newGame";
		if(result!=0) {
			re="redirect:./gameList";
		}
		return re;
	}
	
	@RequestMapping(value="gameSelect")
	public void gameSelect(GameDTO gameDTO, Model model) throws Exception {
		gameDTO = gameService.gameSelect(gameDTO);
		GReviewDTO gReviewDTO = new GReviewDTO();
		gReviewDTO.setGame_num(gameDTO.getNum());
		
		List<GReviewDTO> li = gReviewService.gReviewList(gReviewDTO);

		model.addAttribute("game", gameDTO);
		model.addAttribute("list", li);
	}
	

}
