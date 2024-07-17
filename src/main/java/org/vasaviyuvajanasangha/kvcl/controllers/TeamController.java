package org.vasaviyuvajanasangha.kvcl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.vasaviyuvajanasangha.kvcl.entities.Login;
import org.vasaviyuvajanasangha.kvcl.entities.Team;
import org.vasaviyuvajanasangha.kvcl.pojo.Preferences;
import org.vasaviyuvajanasangha.kvcl.service.TeamService;

import jakarta.validation.Valid;

@Controller
@SessionAttributes(names = {"username","login"})
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("team")
	public String getTeam(ModelMap model){
		Login login =(Login)model.get("login");
		
		if(login.getTeam()==null)
			model.put("team", new Team());
		else
			model.put("team", login.getTeam());
		return "teams";
	}
	
	@GetMapping("update-preferences")
	public String updatePreferences(ModelMap map) {
		map.put("preferences", new Preferences());
		return "updatePreferences";
	}
	
	@PostMapping("update-preferences")
	public String updatePreferences(ModelMap model,Preferences preferences) {
		
		return "redirect:welcome";
	}
	
	@GetMapping("add-team")
	public String addTeam(ModelMap model) {
		model.put("team", new Team());
		return "addTeam";
	}
	
	@PostMapping("add-team")
	public String addTeam(ModelMap model,@Valid Team team) {
		teamService.saveorUpdateTeam((String)model.get("username"), team);
		Login login = (Login)model.get("login");
		login.setTeam(team);
		model.put("login", login);
		return "redirect:welcome-nice";
	}
	
	@GetMapping("update-team")
	public String updateTeam(ModelMap model) {
		Login login =(Login)model.get("login");
		model.put("team", login.getTeam());
		return "addTeam";
	}
	
	@PostMapping("update-team")
	public String updateTeam(ModelMap model,@Valid Team team) {
		return addTeam(model,team);
	}
	
}
