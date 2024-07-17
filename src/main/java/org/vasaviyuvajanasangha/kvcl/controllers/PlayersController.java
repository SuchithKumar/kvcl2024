package org.vasaviyuvajanasangha.kvcl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.vasaviyuvajanasangha.kvcl.entities.Player;
import org.vasaviyuvajanasangha.kvcl.service.PlayersService;

@Controller
@SessionAttributes(names = {"username","login"})
public class PlayersController {

	@Autowired
	private PlayersService playerService;

	@GetMapping("/add-player")
	public String getPlayer(ModelMap model) {
		model.put("player", new Player());
		return "addPlayer";
	}
	
	@PostMapping("/add-player")
	public String getPlayer(ModelMap model,Player player) {	
		playerService.savePlayer((String)model.get("username"), player);
		return "redirect:welcome-nice";
	}
	
	
	
}
