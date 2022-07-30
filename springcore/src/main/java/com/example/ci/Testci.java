package com.example.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testci {

	public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/example/ci/ciconfig.xml");
		 Person p = (Person) context.getBean("person");
		 
		 System.out.println(p);
		 
	}

}
