package com.boot.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public String saveddata(Alien alien) {
		dao.save(alien);
		return "home";
	}
	
	@GetMapping("getAlien")
	public ModelAndView getAlien(int aid) {
		ModelAndView mv=new ModelAndView("hello");
		Alien alien=dao.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
	
	@GetMapping("Alien")
	@ResponseBody
	public List<Alien> getAliens() {
			return dao.findAll();
	}
	
	@GetMapping("Alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAliensById(@PathVariable("aid") int aid) {
			return dao.findById(aid);
	}
	
	
}
