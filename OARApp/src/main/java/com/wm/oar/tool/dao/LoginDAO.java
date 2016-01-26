package com.wm.oar.tool.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import com.wm.oar.tool.domain.Login;
import com.wm.oar.tool.domain.UserDO;
import com.wm.oar.tool.test.TestHibernateVO;

@Component
public class LoginDAO extends BaseDAO {
	
	TestHibernateVO hibernateVO = null ;
	
public Boolean authenticateUser(Login loginVO){
		Boolean isLoginSuccess = false;
		this.hibernateSession.beginTransaction();
		Criteria criteria = this.hibernateSession.createCriteria(UserDO.class);
		criteria.add(Restrictions.eq("emailId", loginVO.getLoginId()));
		criteria.add(Restrictions.eq("password", loginVO.getPassword()));
		UserDO userDO = (UserDO) criteria.uniqueResult();
		if (userDO!=null) {
			isLoginSuccess = true;
			System.out.println("Login found:");
		    System.out.println(userDO.getEmailId() + " - " + userDO.getPassword());
		}
		
		//populateValues(loginVO);
		getHibernateSession().getTransaction().commit();
		
		//this.hibernateSession.close();
		return isLoginSuccess;
	}

	private void populateValues(Login loginVO){
		hibernateVO = new TestHibernateVO();
		hibernateVO.setUserId(loginVO.getLoginId());
		hibernateVO.setPassword(loginVO.getPassword());
		hibernateVO.setFname("Shashi");
		hibernateVO.setLname("SD");
		hibernateVO.setCreatedDtm("2015-01-14");
		
	}

}
