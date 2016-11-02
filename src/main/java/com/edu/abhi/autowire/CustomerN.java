package com.edu.abhi.autowire;

public class CustomerN {
	private PersonN personN;
	private int id=9999;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CustomerN(PersonN personN) {
		System.out.println("autowiring by constructor "+ this.getClass());
		this.personN = personN;
	}

	public CustomerN() {
	
	}
	public void setPersonN(PersonN personN) {
		System.out.println("autowiring by name "+ this.getClass());
		this.personN = personN;
	}

	public PersonN getPersonN() {
		return personN;
	}

	@Override
	public String toString() {
		return "Customer [person=" + personN + ", id=" + id + "] "+ this.getClass();
	}
}

