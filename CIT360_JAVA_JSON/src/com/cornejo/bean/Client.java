package com.cornejo.bean;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.annotate.JsonIgnore;

// Order of the objects
@JsonPropertyOrder(value= {
		"id",
		"last_name",
		"first_name",
		"email"
		
})

public class Client implements Serializable{
	private int id;
	private String first_name;
	private String last_name;
	
	// I want to test ignore 
	@JsonIgnore
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
