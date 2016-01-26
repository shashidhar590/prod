package com.wm.oar.tool.domain;

import java.util.Map;

public class API extends BaseVO{

	private static final long serialVersionUID = 1L;
	
	private String apiName;
	private String templateJSON;
	private Map<String,String> headers;
	private String url;
	
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getTemplateJSON() {
		return templateJSON;
	}
	public void setTemplateJSON(String templateJSON) {
		this.templateJSON = templateJSON;
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	} 
	
}
