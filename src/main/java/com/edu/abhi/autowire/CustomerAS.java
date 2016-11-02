package com.edu.abhi.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerAS {
	
	private PersonA personA;
	private int type;
	private String action;
	
	
	public PersonA getPersonA() {
		return personA;
	}
	
	@Autowired
	public void setPersonA(PersonA personA) {
		this.personA = personA;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "CustomerAS [personA=" + personA + ", type=" + type + ", action=" + action + "]" + this.getClass();
	}	
}
