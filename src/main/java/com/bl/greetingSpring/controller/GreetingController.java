package com.bl.greetingSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bl.greetingSpring.Model.Greeting;
import com.bl.greetingSpring.Model.GreetingUser;
//import com.bl.greetingSpring.Model.GreetingUser;
import com.bl.greetingSpring.service.IGreetingService;

@RestController
@RequestMapping("/GreetingController")
public class GreetingController {
	
	@Autowired
	private IGreetingService greetingService;
	
	@GetMapping(value= {"","/","/home"})
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "world")String name) {
		GreetingUser user = new GreetingUser();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
	}
	
	@GetMapping("/find/{id}")
	public Greeting findById(@PathVariable long id) {
		return greetingService.getGreetingById(id);
	}
	
	@GetMapping("/findall")
	public List<Greeting> findAllEntries(){
		return greetingService.findAllEntries();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteElements(@PathVariable long id) {
		greetingService.deleteEntries(id);
	}
}
