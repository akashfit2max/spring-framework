package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		Pepsi pepsi = (Pepsi) context.getBean("pepsi");
//		System.out.println(pepsi);
		context.registerShutdownHook();

		Course course = (Course) context.getBean("c");
		System.out.println(course);

	}

}
