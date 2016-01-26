package com.wm.oar.tool.domain;

import java.util.List;

public class Product extends BaseVO {

	private static final long serialVersionUID = 1L;
	
	private String productName;
	private List<API> apiList;
	private String productOwner;
	private String productDL;
	private String productDescription;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public List<API> getApiList() {
		return apiList;
	}
	public void setApiList(List<API> apiList) {
		this.apiList = apiList;
	}
	public String getProductOwner() {
		return productOwner;
	}
	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}
	public String getProductDL() {
		return productDL;
	}
	public void setProductDL(String productDL) {
		this.productDL = productDL;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	@Override
	public String toString() {
		return  	 productName +  apiList.toString() + productOwner+	 productDL+	 productDescription;
	}
	
}
