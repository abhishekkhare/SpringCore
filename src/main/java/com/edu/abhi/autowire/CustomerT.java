package com.edu.abhi.autowire;

public class CustomerT {
	private PersonT person;
	private int id=9999;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CustomerT(PersonT person) {
		System.out.println("autowiring by constructor "+ this.getClass());
		this.person = person;
	}

	public CustomerT() {
	
	}
	public void setPerson(PersonT person) {
		System.out.println("autowiring by type "+ this.getClass());
		this.person = person;
	}

	public PersonT getPerson() {
		return person;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", id=" + id + "] "+ this.getClass();
	}
}
