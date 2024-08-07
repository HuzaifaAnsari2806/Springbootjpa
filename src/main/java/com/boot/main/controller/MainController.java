package com.boot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.boot.main.dao.Aliendao;
import com.boot.main.model.Alien;

@Controller
public class MainController {
	
	@Autowired
	Aliendao dao;

//	@PostMapping("home")
	@GetMapping("home")
	public String home( ) {
		return "home";
	}
	
	@GetMapping("addAlien")
	public ModelAndView saveddata(Alien alien) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("hello");
		dao.save(alien);
		return mv;
	}
	
	
}
