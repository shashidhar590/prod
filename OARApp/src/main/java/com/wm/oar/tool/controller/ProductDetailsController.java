package com.wm.oar.tool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wm.oar.tool.domain.API;
import com.wm.oar.tool.domain.Product;
import com.wm.oar.tool.manager.ProductDetailsManager;
import com.wm.oar.tool.utilities.JsonMapperUtil;


@RequestMapping("/login")


@Controller
public class ProductDetailsController {

	@Autowired
	JsonMapperUtil jsonMapper;

	@Autowired
	ProductDetailsManager prodManager;
	
	@RequestMapping(value = "/getProductDetails", method = RequestMethod.POST)
	public String getProductDetails(Product product,ModelMap model ) {
		System.out.println(product.getProductName());
		if(product.getProductName().equalsIgnoreCase("N/A")){
			model.addAttribute("showProdDetails","N");
			List<Product> productList = prodManager.populateOnlyProductNames();
			model.addAttribute("productList",productList);
			return "home";
		}
		product = prodManager.populateProdDetailsFor(product.getProductName());
		List<Product> productList = prodManager.populateOnlyProductNames();
		model.addAttribute("productList",productList);
		model.addAttribute("product",product);
		model.addAttribute("showProdDetails","Y");
		
		try{
		String productJson=jsonMapper.mapObjectToJson(product);
		model.addAttribute("productJson",productJson);
		}catch(Exception exc){
			exc.printStackTrace();
			return "loginFailure";
		}
		
		return "home";
	}
	
	@RequestMapping(value = "/executeApi", method = RequestMethod.POST)
	public String executeAPI(Product product,ModelMap model ) {
		prodManager.executeAPI(product.getApiList().get(0));
		return "home";
	}
	
}
