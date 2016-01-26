package com.wm.oar.tool.dao;

import org.springframework.stereotype.Component;

import com.wm.oar.tool.domain.User;
import com.wm.oar.tool.domain.UserDO;

@Component
public class CreateUserDAO extends BaseDAO{
	
	
	public User createUser(User user){
		
		this.hibernateSession.beginTransaction();
		UserDO userDO = new UserDO();
		copyFromDomaintoDO(user,userDO);
		getHibernateSession().save(userDO);
		
		getHibernateSession().getTransaction().commit();
		
		return user;
	
	}
	
	private void copyFromDomaintoDO(User user, UserDO userDO){
		userDO.setEmailId(user.getEmailId());
		userDO.setPassword(user.getLogin().getPassword());
		userDO.setFname(user.getFname());
		userDO.setLname(user.getLname());
		userDO.setCreatedDtm(user.getCreatedTs());
		userDO.setModifiedDtm(user.getUpdatedTs());
	}

}
