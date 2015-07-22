package com.test;

public class Student {

	// 流水号
	private int id;
	// 学生名
	private String Name;
	
	private String sex;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Student(int id, String name, String sex) {
		super();
		this.id = id;
		Name = name;
		this.sex = sex;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", sex=" + sex + "]";
	}


}