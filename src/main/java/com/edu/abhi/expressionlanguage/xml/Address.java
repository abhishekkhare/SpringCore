package com.edu.abhi.expressionlanguage.xml;

public class Address {

	private String street;

	private int postcode;

	private String country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public String getFullAddress(String prefix) {

		return prefix + " : " + street + " " + postcode + " " + country;
	}



	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + ", country=" + country + "]";
	}

}
