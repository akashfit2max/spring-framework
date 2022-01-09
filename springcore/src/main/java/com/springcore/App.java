package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("created by akash");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/cnfig.xml");
		Student student = (Student) context.getBean("student1");
		System.out.println(student);
	}
}
