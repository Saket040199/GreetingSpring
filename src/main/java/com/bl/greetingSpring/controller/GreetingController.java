package com.bl.greetingSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bl.greetingSpring.Model.GreetingUser;

@RestController
@RequestMapping("/GreetingController")
public class GreetingController {

	@RequestMapping( method = RequestMethod.GET,value = {"/home"})
	public String sayHello() {
		return "Greeting User";
    }
	
	@RequestMapping (value = {"/query"} , method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name ) {
		return "Greeting  " + name + " !! ";
	}
	
	@RequestMapping (value = {"/query2"} , method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "fname") String fname , @RequestParam(value = "lname")String lname ) {
		return "Greeting  " + fname +" "+ lname + " !! ";
	}
	
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Greeting " + name +" !!";
	}
	
	@PostMapping("/post")
	public String sayHello(@RequestBody GreetingUser user) {
		return "Greeting " + user.getFirstName() + " " + user.getLastName() + "!!";
	}
	
	@PutMapping("/put/{firstName}")
	public String sayHelloPut(@PathVariable String firstName, @RequestParam(value= "lastName") String lastName) {
		return "Greeting" + firstName + " " + lastName + "!";
	}
}
