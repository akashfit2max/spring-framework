package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

//	without using component scan on the class 
//	if u dnt give name is the @bean annotation it will take the name of the method i.e getStudent
	@Bean(name = "stu")
	public Student getStudent() {
		return new Student(getSamosa(), "akash", 12);
	}

}
