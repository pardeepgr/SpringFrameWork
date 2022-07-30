package com.example.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/example/standalone/collections/standaloneconfig.xml");
		
		Person person1 = (Person) context.getBean("person1");
		System.out.println(person1);
		System.out.println(person1.getFeeStructure().getClass().getName());

	}

}
