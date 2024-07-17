package org.vasaviyuvajanasangha.kvcl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.vasaviyuvajanasangha.kvcl.entities.Login;
import org.vasaviyuvajanasangha.kvcl.service.LoginService;

import jakarta.validation.Valid;

@Controller
@SessionAttributes(names = {"username","login"})
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	
	@GetMapping("login")
	public String login(ModelMap model) {
		return "login";
	}
	
	@PostMapping("login")
	public String login(@RequestParam String username,@RequestParam String password,ModelMap model) {
		if(loginService.isAuthenticated(username, password)) {
			model.put("username", username);
			model.put("login", loginService.getLogin(username));
			return "redirect:welcome-nice";
		}else {
			model.put("loginError", "Incorrect username or password!");
			return "login";
		}
	}
	
	@GetMapping(name = "welcome",path = {"welcome"})
	public String welcome(ModelMap model){
		Login login = loginService.getLogin((String)model.get("username"));
		model.put("team", login.getTeam());
		return "welcome";
	}
	
	@GetMapping(name = "welcome-nice",path = {"welcome-nice"})
	public String welcomeNice(ModelMap model){
		Login login = loginService.getLogin((String)model.get("username"));
		model.put("team", login.getTeam());
		return "welcomeNice";
	}
	
	@GetMapping("register-user")
	public String registerUser(ModelMap model) {
		Login login = new Login();
		model.put("login", login);
		return "registerLogin";
	}
	
	@PostMapping("register-user")
	public String registerUser(ModelMap model,@Valid Login login) {
		loginService.registerUser(login);
		model.put("login", login);
		return "redirect:welcome-nice";
	}
	
	@GetMapping(name="home",path = "/")
	public String home() {
		return "home";
	}
	
}
