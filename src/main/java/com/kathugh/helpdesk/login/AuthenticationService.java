package com.kathugh.helpdesk.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("kat");
		boolean isValidPassword = password.equals("kat");
		
		return isValidUserName && isValidPassword;
	}

}
