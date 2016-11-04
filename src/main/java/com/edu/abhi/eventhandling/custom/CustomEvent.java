package com.edu.abhi.eventhandling.custom;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomEvent(Object source) {
		super(source);
	}

	public String toString() {
		return "My Custom Event";
	}
}
