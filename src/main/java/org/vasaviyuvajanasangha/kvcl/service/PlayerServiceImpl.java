package org.vasaviyuvajanasangha.kvcl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vasaviyuvajanasangha.kvcl.entities.Login;
import org.vasaviyuvajanasangha.kvcl.entities.Player;
import org.vasaviyuvajanasangha.kvcl.entities.Team;
import org.vasaviyuvajanasangha.kvcl.repository.PlayersRepository;

@Service
public class PlayerServiceImpl implements PlayersService{

	@Autowired
	private TeamService teamService;
	
	@Autowired
	private PlayersRepository playerRepository;
	
	@Autowired
	private LoginService loginService;
	
	@Override
	public void savePlayer(String username, Player player) {
		Player savedPlayer = playerRepository.save(player);
		Login login = loginService.getLogin(username);
		Team team = login.getTeam();
		List<Player> players = team.getPlayers();
		if(players==null)
			players = new ArrayList<>();
		players.add(savedPlayer);
		teamService.saveorUpdateTeam(username, team);
	}

}
