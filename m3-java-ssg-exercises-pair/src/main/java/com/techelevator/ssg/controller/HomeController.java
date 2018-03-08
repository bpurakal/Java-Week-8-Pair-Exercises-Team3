package com.techelevator.ssg.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.AlienAge;
import com.techelevator.ssg.model.AlienTravelTime;
import com.techelevator.ssg.model.AlienWeight;
import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;
import com.techelevator.ssg.model.forum.JdbcForumDao;

@Controller
public class HomeController {

	@Autowired
	ForumDao forumDao;
	
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
		modelHolder.put("calculatedAge", calculatedAge.calculateAlienAge());
		return "alienAgeOutput";
	}
	
	@RequestMapping(path="/alienWeightInput", method=RequestMethod.GET)
	public String alienWeightInput() {
		return "alienWeightInput";
	}
	
	@RequestMapping(path="/alienWeightOutput", method=RequestMethod.GET)
		public String alienWeightOutput(@RequestParam double earthWeight, @RequestParam String choosePlanet, ModelMap modelHolder) {
			AlienWeight calculatedWeight = new AlienWeight(earthWeight, choosePlanet);
			modelHolder.put("earthWeight", earthWeight);
			modelHolder.put("planetName", choosePlanet);
			modelHolder.put("calculatedWeight", calculatedWeight.calculateAlienWeight());
		return "alienWeightOutput";
	}
	
	@RequestMapping(path="/AlienTravelTimeInput", method=RequestMethod.GET)
	public String alienTravelInput() {
		return "AlienTravelTimeInput";
	}
	
	@RequestMapping(path="/AlienTravelTimeOutput", method=RequestMethod.GET)
	public String alienTravelOutput(@RequestParam double earthAge, @RequestParam String choosePlanet, @RequestParam long chooseTransportation, ModelMap modelHolder) {
		AlienTravelTime calculatedTravelTime = new AlienTravelTime(earthAge, choosePlanet, chooseTransportation);
		modelHolder.put("planetName", choosePlanet);
		modelHolder.put("earthAge", earthAge);
		modelHolder.put("calculatedTravelTime", calculatedTravelTime.calculateTravelTime());
		modelHolder.put("transportation", calculatedTravelTime.modeOfTransportString(chooseTransportation));
	return "AlienTravelTimeOutput";
}

	@RequestMapping(path="/displayPosts", method=RequestMethod.GET)
	public String displayPosts(ModelMap mm) {
		mm.put("posts", forumDao.getAllPosts());
		return "displayPosts";
	}
	
	@RequestMapping(path="/createNewPost", method=RequestMethod.GET)
	public String createNewPost() {
		return "createNewPost";
	}
	
	@RequestMapping(path="/savePost", method=RequestMethod.POST)
	public String savePost (@ModelAttribute("username") String username, @ModelAttribute("message") String message, @ModelAttribute("subject") String subject) {
		ForumPost post = new ForumPost();
		LocalDateTime datePosted = LocalDateTime.now();
		post.setUsername(username);
		post.setSubject(subject);
		post.setMessage(message);
		post.setDatePosted(datePosted);

		forumDao.save(post);
		
		return "redirect:/createNewPost";
	}
	

}
