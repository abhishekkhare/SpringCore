package com.edu.abhi.autowire;

public class CustomerC {
	private PersonC person;
	private int id=9999;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CustomerC(PersonC person) {
		this.person = person;
		System.out.println("autowiring by constructor "+ this.getClass());
	}

	public CustomerC() {
	
	}
	public void setPerson(PersonC person) {
		System.out.println("autowiring by type "+ this.getClass());
		this.person = person;
	}

	public PersonC getPerson() {
		return person;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", id=" + id + "] " + this.getClass();
	}
}

