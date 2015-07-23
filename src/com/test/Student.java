package com.test;

public class Student extends Person {

	private String subject;
	
	public String getSubject(){
		return subject;
	}
	
	public void setSubject(String sub){
		subject = sub;
	}
	
	
	private String doSomething(String str){
		System.out.println("student doing..."+ str);
		return null;
	}
	public Student() {
		
	}


}