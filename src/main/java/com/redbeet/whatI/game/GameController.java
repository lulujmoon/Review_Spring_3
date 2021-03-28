package com.redbeet.whatI.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/game/*")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@RequestMapping(value="gameList")
	public void gameList(Model model) throws Exception {
		List<GameDTO> li = gameService.gameList();
		model.addAttribute("list", li);
	}
}
