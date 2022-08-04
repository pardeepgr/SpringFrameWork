package com.example.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testjc {

	public static void main(String[] args) {

		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = con.getBean("s2", Student.class);

		System.out.println(student);
		student.Study();
	}

}
