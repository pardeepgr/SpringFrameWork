package com.example.stereotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testst {

	private static ApplicationContext con;

	public static void main(String[] args) {
		con = new ClassPathXmlApplicationContext("com/example/stereotypes/stereoconfig.xml");
		
		Student student1 = con.getBean("student",Student.class);
		System.out.println(student1);
		
		System.out.println("__________________________________________________");
		
		System.out.println("Addresses = "+student1.getAddress());
	}

}
