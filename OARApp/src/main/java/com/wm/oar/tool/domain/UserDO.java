package com.wm.oar.tool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="OAR_LOGIN")
public class UserDO {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name="USER_KEY")
	private String userKey;
	
	@Column(name="USER_ID")
	private String emailId;

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
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
}
