package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
public class StudentReport {

	/*---Function for grade calculation----*/
	 public String findGrades(Student studentObject){
	// write code here 
		 int sum=0;
		 int arr[] = studentObject.getMarks();
		 if(arr!=null) {
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]<35)
				 return "F";
			 else
				 sum+=arr[i];
		 }
		 if(sum<=150)
			 return "C";
		 else if(sum>150 && sum<=200)
			 return "B";
		 else if(sum>200 && sum<=250)
			 return "A";
		 else
			 return "A+";
		 }
		 else
		 return "";
	}
	 /*---Function for validation----*/
	
	public String validate(Student s)throws NullNameException, NullMarksArrayException, NullStudentObjectException
	{
	// write code here 
		if (s == null) {
			throw new NullStudentObjectException();
		} else {
		if(s.getName()==null)
			 throw new NullNameException();
		if(s.getMarks() == null)
			 throw new NullMarksArrayException();
		
			return findGrades(s);
		}
	}
	
}
