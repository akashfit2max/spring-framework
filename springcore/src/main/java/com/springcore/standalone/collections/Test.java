package com.springcore.standalone.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/aloneconig.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("_______________________________________");
		System.out.println(person.getFees());
		System.out.println(person.getFees().getClass().getName());
		System.out.println("_______________________________________");
		System.out.println(person.getProperties());
		System.out.println(person.getProperties
				().getClass().getName());
	}

}
