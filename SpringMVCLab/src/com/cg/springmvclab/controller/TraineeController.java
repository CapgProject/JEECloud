package com.cg.springmvclab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.springmvclab.dto.Trainee;
import com.cg.springmvclab.service.TraineeService;

@Controller
public class TraineeController {

	@Autowired
	TraineeService service;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showHomePage() {		
		return "index";		
	}
	@RequestMapping(value="/showOptions", method=RequestMethod.GET)
	public String login() {		
		return "login";		
	}
	@RequestMapping(value="/Options", method=RequestMethod.POST)
	public String afterLogin() {		
		return "options";		
	}
	
	@RequestMapping(value="/addtrainee",method=RequestMethod.GET)
	public String showAddTrainer(@ModelAttribute("trn") Trainee trainee) {
		return "AddTrainee";
	}
	@RequestMapping(value="/added", method=RequestMethod.POST)
	public String addTrainee(@ModelAttribute("trn") Trainee trainee) {
		service.addTrainee(trainee);
		return "options";		
	}
	@RequestMapping(value = "/deletetrainee", method = RequestMethod.GET)
	public String showDeleteTrainee() {
		return "DeleteTrainee";
	}
	@RequestMapping(value="/deleted", method = RequestMethod.POST)
	public String delete() {
		return "";
	}
}
