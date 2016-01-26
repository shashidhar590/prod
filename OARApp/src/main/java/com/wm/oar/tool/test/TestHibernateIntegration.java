package com.wm.oar.tool.test;

import com.wm.oar.tool.dao.LoginDAO;
import com.wm.oar.tool.domain.Login;

public class TestHibernateIntegration {

	public static void main(String[] args) {
		testAuthenticateUser();
	}
	
	public static void testAuthenticateUser(){
		Login login = new Login();
		LoginDAO loginDAO = new LoginDAO();
		login.setUserId("sdadden");
		login.setPassword("iForgot");
		
		loginDAO.authenticateUser(login);
	}

}
