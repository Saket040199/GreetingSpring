package com.bl.greetingSpring.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bl.greetingSpring.Model.Greeting;
import com.bl.greetingSpring.Model.GreetingUser;
import com.bl.greetingSpring.repository.GreetingRepository;

@Service
public class GreetingService implements IGreetingService{
	private static final String template = "Hello, %s !";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public Greeting addGreeting(GreetingUser user) {
		String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}

	@Override
	public Greeting getGreetingById(long id) {
		return greetingRepository.findById(id).get();
	}
	
	@Override
	public List<Greeting> findAllEntries() {
		return greetingRepository.findAll();
	}
	
	@Override
	public void deleteEntries(long id) {
		greetingRepository.deleteById(id);
	}

	@Override
	public Greeting editEntries(GreetingUser user, long id) {
		String message = String.format(template, (user.toString().isEmpty())?"Hello World" :user.toString());
		return greetingRepository.save(new Greeting(id,message));
	}
	
}