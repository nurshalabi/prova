package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String getWelcome(Model model) {
		model.addAttribute("intestazione","Welcome no mapping");
		model.addAttribute("saluti","ciao!");
		return "index";
	}
	
	@GetMapping(value="index")
	public String getWelcome2(Model model) {
		model.addAttribute("intestazione","Welcome with mapping");
		model.addAttribute("saluti","ciao!");
		return "index";
	}
	
}
