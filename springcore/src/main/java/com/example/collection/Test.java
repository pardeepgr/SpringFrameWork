package com.example.collection;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/example/collection/collectionconfig.xml");
		Emp emp2 = (Emp) context.getBean("emp2");
		
		System.out.println(emp2.getEmpName());
		System.out.println(emp2.getAddresses());
		System.out.println(emp2.getPhones());
		System.out.println(emp2.getCourses());
		System.out.println(emp2.getProps());
	}

}
