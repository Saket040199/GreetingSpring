package com.bl.greetingSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bl.greetingSpring.Model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
