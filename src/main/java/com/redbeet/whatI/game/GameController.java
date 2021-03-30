package com.redbeet.whatI.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value="addNewGame")
	public void addNewGame() throws Exception {}
	
	@RequestMapping(value="addNewGame", method= RequestMethod.POST)
	public String addNewGame(GameDTO gameDTO) throws Exception {
		int result = gameService.gameInsert(gameDTO);
		String re="/game/addNewGame";
		if(result!=0) {
			re="redirect:./gameList";
		}
		return re;
	}
	
	
}
