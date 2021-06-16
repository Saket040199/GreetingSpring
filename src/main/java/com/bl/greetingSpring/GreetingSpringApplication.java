package com.bl.greetingSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingSpringApplication.class, args);
		System.out.println("Project is Deploying Properly");
	}

}
