package com.cakes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

//	@GetMapping({"/","index","/home"})
	@GetMapping("/")
	public String index(){
		return "index";
	}
	
}
