package com.springcore.lifecycle;

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

//	@PostConstruct    
//    annotation laga doge thoo xml me config ki koi zaroorrat nai h
    public void start() {
	System.out.println("starting method");
    }

//	@PreDestroy
    public void end() {
	System.out.println("ending method");
    }

}
