package com.wm.oar.tool.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="OAR_LOGIN")
public class TestHibernateVO {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name="USER_KEY")
	private String userKey;
	
	
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="FNAME")
	private String fname;
	
	@Column(name="LNAME")
	private String lname;
	
	@Column(name="PASSCODE")
	private String password;
	
	@Column(name="CREATED_DTM")
	private String createdDtm;
	
	@Column(name="MODIFIED_DTM")
	private String modifiedDtm;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreatedDtm() {
		return createdDtm;
	}
	public void setCreatedDtm(String createdDtm) {
		this.createdDtm = createdDtm;
	}
	public String getModifiedDtm() {
		return modifiedDtm;
	}
	public void setModifiedDtm(String modifiedDtm) {
		this.modifiedDtm = modifiedDtm;
	}
	
	
	public String getUserKey() {
		return userKey;
	}
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}
	
	@Override
	public String toString() {
		return userId+fname+lname+password+createdDtm+modifiedDtm+userKey;
	}
	
}
