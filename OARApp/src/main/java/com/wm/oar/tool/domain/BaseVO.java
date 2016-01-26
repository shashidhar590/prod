package com.wm.oar.tool.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String systemTime;
	private String createdBy;
	private String updatedBy;
	private String createdTs;
	private String updatedTs;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getSystemTime() {
		return getCurrentSystemTime();
	}
	
	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(String createdTs) {
		this.createdTs = createdTs;
	}

	public String getUpdatedTs() {
		return updatedTs;
	}

	public void setUpdatedTs(String updatedTs) {
		this.updatedTs = updatedTs;
	}
	
	private String getCurrentSystemTime(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 Date date = new Date();
		 System.out.println("Current time is	"+systemTime);
		return dateFormat.format(date);
	}
	
	
}
