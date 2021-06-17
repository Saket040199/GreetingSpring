package com.bl.greetingSpring.Model;

public class Greeting {

	private String name;
	private long id;
	
	public Greeting(long incrementAndGet, String format) {
		this.id=incrementAndGet;
		this.name=format;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
}
