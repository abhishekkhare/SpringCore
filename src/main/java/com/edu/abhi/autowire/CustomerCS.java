package com.edu.abhi.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerCS {
	
	private PersonA personA;
	private int type;
	private String action;
	
	@Autowired
	public CustomerCS(PersonA personA) {
		this.personA = personA;
	}


	public PersonA getPersonA() {
		return personA;
	}
	
	
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
		return "CustomerCS [personA=" + personA + ", type=" + type + ", action=" + action + "]" + this.getClass();
	}	
}
