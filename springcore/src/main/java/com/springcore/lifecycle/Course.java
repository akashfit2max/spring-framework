package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Course {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [subject=" + subject + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}

	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}

}
