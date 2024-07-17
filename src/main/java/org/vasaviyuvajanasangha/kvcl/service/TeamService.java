package org.vasaviyuvajanasangha.kvcl.service;

import java.util.Set;

import org.vasaviyuvajanasangha.kvcl.entities.Team;
import org.vasaviyuvajanasangha.kvcl.pojo.Preferences;

public interface TeamService {
	
	void saveorUpdateTeam(String username,Team user);
	Team findTeam(Long id);
	Set<Team> findAllTeams();
	Team updatePreferences(Preferences preferences);

}
