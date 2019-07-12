package com.ecm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping("/")
	public String onBoardPage(Model model) {
		model.addAttribute("msg", "welocme");
		return "index";
	}

}

