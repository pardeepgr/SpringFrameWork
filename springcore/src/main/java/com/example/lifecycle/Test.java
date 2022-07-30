package com.example.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/example/lifecycle/lcconfig.xml");
		
		context.registerShutdownHook();
		
		Samosa s1 =(Samosa) context.getBean("s1");
		System.out.println(s1);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Barfi b1 = (Barfi) context.getBean("B1");
		System.out.println(b1);
	}

}
