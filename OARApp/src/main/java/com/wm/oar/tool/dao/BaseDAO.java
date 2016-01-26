package com.wm.oar.tool.dao;

import org.hibernate.Session;

import com.wm.oar.tool.utilities.HibernateUtil;

public class BaseDAO {

	Session hibernateSession = HibernateUtil.getSessionFactory().openSession();

	public Session getHibernateSession() {
		return hibernateSession;
	}

	public void setHibernateSession(Session hibernateSession) {
		this.hibernateSession = hibernateSession;
	}

	
	
	
}
