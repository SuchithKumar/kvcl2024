package org.vasaviyuvajanasangha.kvcl.service;

import org.vasaviyuvajanasangha.kvcl.entities.Login;

public interface LoginService {
	public boolean isAuthenticated(String username,String password);
	public Login registerUser(Login login);
	public Login getLogin(String username);
	public Login updateLogin(Login login);

}
