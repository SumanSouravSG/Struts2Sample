package com.tutorialspoint.service;

import com.tutorialspoint.model.User;

public class LoginService {

	public boolean verifyUser(User user){
		if(user.getUsername().equals("syed") && user.getPassword().equals("syed123"))
			return true;
		else
			return false;
	}
}
