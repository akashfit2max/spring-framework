package com.springcore.autowire.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/anotation/autoconfig.xml");
		Employee emp = (Employee) context.getBean("emp1");
		System.out.println(emp);

		
//		@Autowired
//		knhi bhee daal skte h 
		
	}

}
