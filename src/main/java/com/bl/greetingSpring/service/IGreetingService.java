package com.bl.greetingSpring.service;

import java.util.List;

import com.bl.greetingSpring.Model.Greeting;
import com.bl.greetingSpring.Model.GreetingUser;

public interface IGreetingService {

	Greeting addGreeting(GreetingUser user);
	Greeting getGreetingById(long id);
	List<Greeting> findAllEntries();
	void deleteEntries(long id);
}
