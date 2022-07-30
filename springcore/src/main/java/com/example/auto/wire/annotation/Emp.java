package com.example.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("temp2")
	private Address address;
	

	public Address getAddress() {
		return address;
	}
	
	public Emp(Address address) {
		super();
		this.address = address;
		
		System.out.println("inside constructor!");
	}
	
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
		
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
