package com.ecm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecm.entity.AppUser;
import com.ecm.service.IAppUserService;

@Controller					
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IAppUserService appService;
	
	@RequestMapping("/register")
	public String saveUser(Model model,AppUser au) {
		model.addAttribute("msg",appService.registerUser(au));
		return "index";
	}
}
