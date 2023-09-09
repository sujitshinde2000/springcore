package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("inside setter method");

	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	
	
	
	

}
