package com.mile1.bean;
import com.mile1.service.StudentReport;
public class Student extends StudentReport {
	String name;
	int marks []; 
	String grade;
	
	/* ---------Getter and Setter method------- */
	public String getName() {
		return this.name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int[] getMarks() {
		return this.marks;
	}
	
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
	
	public String getGrade() {
		return grade;
	}
	
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public Student () {								//Students's no-argument constructor
		
	}
	
	
	public Student(String name, int [] marks)		// Student's argument constructor 
	{
		setName(name);
		setMarks(marks);
		
	}
	
}
