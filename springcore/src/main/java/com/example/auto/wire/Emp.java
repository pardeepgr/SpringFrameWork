package com.example.auto.wire;

public class Emp {
	
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
