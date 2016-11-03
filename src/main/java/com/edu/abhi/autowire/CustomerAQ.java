package com.edu.abhi.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CustomerAQ {
	@Autowired
	@Qualifier("PersonA123")
	private PersonAQ personAQ;
	private int type;
	private String action;
	
	
	public PersonAQ getPersonA() {
		return personAQ;
	}
	public void setPersonA(PersonAQ personAQ) {
		this.personAQ = personAQ;
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
		return "CustomerA [personAQ=" + personAQ + ", type=" + type + ", action=" + action + "]" + this.getClass();
	}	
}
