package com.edu.abhi.expressionlanguage.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.edu.abhi.expressionlanguage.annotation.Item;

@Component("customerBean")
public class Customer {
	
	@Value("#{'abhi'.toUpperCase()}")
	private String name;

	@Value("#{priceBean.getSpecialPrice()}")
	private double amount;

	
	@Value("#{addressBean}")
	private Address address;

	@Value("#{addressBean.country}")
	private String country;

	@Value("#{addressBean.getFullAddress('abhi')}")
	private String fullAddress;


	@Value("#{itemBean}")
	private Item item;

	@Value("#{itemBean.name}")
	private String itemName;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", amount=" + amount + ", address=" + address + ", country=" + country
				+ ", fullAddress=" + fullAddress + ", item=" + item + ", itemName=" + itemName + "]";
	}

	
	
	

}
