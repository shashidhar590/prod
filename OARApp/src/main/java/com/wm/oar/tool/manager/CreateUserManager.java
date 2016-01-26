package com.wm.oar.tool.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wm.oar.tool.dao.CreateUserDAO;
import com.wm.oar.tool.domain.User;


@Component
public class CreateUserManager {

	@Autowired
	CreateUserDAO createUserDAO; 

	public User createUser(User user){
		
		return createUserDAO.createUser(user);
	}
}
