package com.wm.oar.tool.dao;

import org.springframework.stereotype.Component;

import com.wm.oar.tool.domain.API;

@Component
public class ProductDetailsDAO {

	public String executAPI(API api){
		
		System.out.println(api.getApiName());
		System.out.println(api.getTemplateJSON());
		System.out.println(api.getUrl());
		return null;
		
	}
}
