
package com.wm.oar.tool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wm.oar.tool.domain.Login;
import com.wm.oar.tool.domain.Product;
import com.wm.oar.tool.manager.LoginManager;
import com.wm.oar.tool.manager.ProductDetailsManager;
import com.wm.oar.tool.utilities.JsonMapperUtil;
import com.wm.oar.tool.utilities.PopulateValuesUtil;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	Login logVO;
	
	@Autowired
	LoginManager loginManager;
	
	@Autowired
	PopulateValuesUtil populateValues;
	
	@Autowired
	JsonMapperUtil jsonMapper;
	
	@Autowired
	ProductDetailsManager productManager;
	
	
	@RequestMapping(value = "/register", method = { RequestMethod.GET, RequestMethod.POST }) 
	public String redirectToLogin(ModelMap model) { 
	    model.addAttribute("login", new Login()); 
	    return "login"; 
	}
	
	@RequestMapping(value = "/loginAction", method = RequestMethod.POST)
	public String authUserLogin(@ModelAttribute Login loginVO, @ModelAttribute Product product,ModelMap model ) {
		System.out.println(loginVO.getLoginId());
		System.out.println(loginVO.getPassword());
		
		Boolean isLoginSuccess= false;
		try{
			//isLoginSuccess= loginManager.authenticateUser(loginVO);
			isLoginSuccess = true;
		if(isLoginSuccess){
			List<Product> productList = productManager.populateOnlyProductNames();
			model.addAttribute("productList",productList);
			return "home";
		}
		
		//List<Product> productList = loginManager.populateStaticValues();
		
		}catch(Exception exc){
			exc.printStackTrace();
			 return "loginFailure";
		}
	    return "loginFailure";
	}
	
	@RequestMapping(value = "/loginActionlater", method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute Login loginVO, @ModelAttribute Product product,ModelMap model ) {
		System.out.println(loginVO.getLoginId());
		System.out.println(loginVO.getPassword());
		
		Boolean isSuccess= false;
		try{
		isSuccess= loginManager.authenticateUser(loginVO);
		
		List<Product> productList = populateValues.populateStaticValues();
		
		model.addAttribute("productList",productList);
		
		String productJson=jsonMapper.mapObjectToJson(productList);
		
		model.addAttribute("productJson",productJson);
		
		}catch(Exception exc){
			exc.printStackTrace();
			 return "loginFailure";
		}
		
		
		if(isSuccess){
			return "home";
		}
		
	    return "loginFailure";
	}

	@RequestMapping(value = "/redirect", method = { RequestMethod.GET, RequestMethod.POST }) 
	public String indexMethod(ModelMap model) { 
	    model.addAttribute("login", new Login()); 
	    return "index"; 
	}
	

}
