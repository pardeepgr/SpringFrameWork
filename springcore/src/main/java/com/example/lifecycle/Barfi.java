package com.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Barfi {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Barfi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Barfi [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		
		System.out.println("Starting Method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending Method");
	}
	
}
