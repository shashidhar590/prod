package com.wm.oar.tool.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wm.oar.tool.dao.LoginDAO;
import com.wm.oar.tool.domain.Login;

@Component
public class LoginManager {
	
	@Autowired
	LoginDAO dao; 

	public Boolean authenticateUser(Login loginVO){
		return dao.authenticateUser(loginVO);
	}
	
	
	
}
