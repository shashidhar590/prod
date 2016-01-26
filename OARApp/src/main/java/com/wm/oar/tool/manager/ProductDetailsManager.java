package com.wm.oar.tool.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wm.oar.tool.controller.ProductDetailsController;
import com.wm.oar.tool.dao.ProductDetailsDAO;
import com.wm.oar.tool.domain.API;
import com.wm.oar.tool.domain.Product;
import com.wm.oar.tool.utilities.PopulateValuesUtil;


@Component
public class ProductDetailsManager {

	@Autowired
	PopulateValuesUtil populateValues;
	
	@Autowired
	ProductDetailsDAO detailsDAO;
	
	
	public Product populateProdDetailsFor(String prodName){
		List<Product> tempProdList = populateValues.populateStaticValues();
		Product productObj = null;
		ListIterator<Product> listIterator = tempProdList.listIterator();
		
		while(listIterator.hasNext()){
			productObj = listIterator.next();
			if(productObj.getProductName().equals(prodName)){
				return productObj;
			}
		}
		return null;
	}
	
	public List<Product> populateOnlyProductNames (){
		List<Product> productList = new ArrayList<Product>();
		
		Product tempProduct0 = new Product();
		tempProduct0.setProductName("--Select Product--");
		
		Product tempProduct = new Product();
		tempProduct.setProductName("OS");
		tempProduct.setCreatedBy("Shashi");
		tempProduct.setCreatedTs("2016-01-15");
		tempProduct.setProductOwner("Shashi");
		tempProduct.setProductDescription("Order Service");
		tempProduct.setProductDL("product DL.. ");
		productList.add(tempProduct);
		Product tempProduct2 = new Product();
		tempProduct2.setProductName("RMS");
		tempProduct2.setCreatedBy("RMS team");
		tempProduct2.setCreatedTs("2016-01-16");
		tempProduct2.setProductOwner("Not me");
		tempProduct2.setProductDescription("RMS Service");
		tempProduct2.setProductDL("RMS DL.. ");
		
		productList.add(tempProduct2);
		return productList;
	}
	
	public String executeAPI(API api){
		return detailsDAO.executAPI(api);
	}
	
}
