package com.bl.greetingSpring.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Greetings")
public class Greeting {

	@Id
	private long id;
	private String name;
	
	
	public Greeting() {
		id =0;
		name = "";
		// TODO Auto-generated constructor stub
	}
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
