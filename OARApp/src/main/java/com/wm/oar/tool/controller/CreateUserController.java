package com.wm.oar.tool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wm.oar.tool.domain.User;
import com.wm.oar.tool.manager.CreateUserManager;



@Controller
@RequestMapping("/signup")
public class CreateUserController {
	
	@Autowired
	CreateUserManager createUserManager ; 
	
	@RequestMapping(value = "/register", method = { RequestMethod.GET, RequestMethod.POST }) 
	public String displayLogin(ModelMap model) { 
	    model.addAttribute("user", new User()); 	
	    return "createUser"; 
	}
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String createUser(User userVO, @ModelAttribute ModelMap model) {
		
		userVO.getLogin().setLoginId(userVO.getEmailId());
		userVO = createUserManager.createUser(userVO);
		model.addAttribute("user",userVO);
	    return "displayUserDetails";
	}
	

}
