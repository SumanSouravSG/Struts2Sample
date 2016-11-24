package com.tutorialspoint.struts;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tutorialspoint.model.User;
import com.tutorialspoint.service.LoginService;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	private User user = new User();
	
	public void validate(){
		if(StringUtils.isEmpty(user.getUsername())){
			addFieldError("username", "username is empty");
		}
		if(StringUtils.isEmpty(user.getPassword())){
			addFieldError("password", "password is empty");
		}
	}
	
	public String execute(){
		LoginService loginservice = new LoginService();
		if(loginservice.verifyUser(user))
			return SUCCESS;
		else
			return LOGIN;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
