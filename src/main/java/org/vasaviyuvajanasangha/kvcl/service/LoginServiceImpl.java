package org.vasaviyuvajanasangha.kvcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vasaviyuvajanasangha.kvcl.entities.Login;
import org.vasaviyuvajanasangha.kvcl.entities.Team;
import org.vasaviyuvajanasangha.kvcl.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public boolean isAuthenticated(String username, String password) {
		var optionUser = loginRepository.findById(username);
		if(!optionUser.isEmpty()) {
			var user = optionUser.get();
			if(user.getPassword().equalsIgnoreCase(password))
				return true;
			return false;
		}
		return false;
	}

	@Override
	public Login registerUser(Login login) {
		System.out.println(login);
		return loginRepository.save(login);
	}

	@Override
	public Login getLogin(String username) {
		return loginRepository.findById(username).get();
	}

	@Override
	public Login updateLogin(Login login) {
		return loginRepository.save(login);
	}
	
	
}
