package com.techelevator.ssg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.AlienAge;

@Controller
public class HomeController {

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayHomePage() {
		return "homePage";
	}
	
	@RequestMapping(path="/alienAgeInput", method=RequestMethod.GET)
	public String alienAgeInput() {
		return "alienAgeInput";
	}
	
	@RequestMapping(path="/alienAgeOutput", method=RequestMethod.GET)
	public String alienAgeOutput(@RequestParam double earthAge, @RequestParam String choosePlanet, ModelMap modelHolder) {
		AlienAge calculatedAge = new AlienAge(earthAge, choosePlanet);
		modelHolder.put("earthAge", earthAge);
		modelHolder.put("planetName", choosePlanet);
		modelHolder.put("calculatedAge", calculatedAge);
		return "alienAgeOutput";
	}
	

}
