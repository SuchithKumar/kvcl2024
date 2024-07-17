package org.vasaviyuvajanasangha.kvcl.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vasaviyuvajanasangha.kvcl.entities.Login;
import org.vasaviyuvajanasangha.kvcl.entities.Team;
import org.vasaviyuvajanasangha.kvcl.pojo.Preferences;
import org.vasaviyuvajanasangha.kvcl.repository.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService{
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private TeamRepository repository;
	
	@Override
	public void saveorUpdateTeam(String username,Team team) {
		repository.save(team);
		Login login = loginService.getLogin(username);
		login.setTeam(team);
		loginService.updateLogin(login);
	}

	@Override
	public Team findTeam(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Set<Team> findAllTeams() {
		return new HashSet<Team>(repository.findAll());
	}

	@Override
	public Team updatePreferences(Preferences preferences) {
		
		return null;
	}

}
