package com.javaex.ex12;

public class Student extends Person{
	//필드
	
	private String schoolName;
	//생성자
	
	public Student() {
		System.out.println("Student()");
	}
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	public Student(String name, int age, String schoolName) {
		super(name, age); //부모생성자 상속
		this.schoolName = schoolName; //본인생성자
		System.out.println("Student(3)");
	}
	
	//메소드-gs
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드-일반
	
	
}
