package com.mile1.service;
import com.mile1.bean.Student;
public class StudentService {

	/*---Function for calculate the number of object with null marks array----*/
	public int findNumberOfNullMarksArray(Student s[]) {
	// write code here 
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) {
			if(s[i].getMarks()==null)
				count++;
			}
			
		}
		return count;
	}
	/*---Function for calculate the number of object with null name---*/
	public int findNumberOfNullName (Student s[]) {
	// write code here 
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]!=null) {
			if(s[i].getName()==null)
				count++;
			}
		}
		return count;
	}
	/*---Function for calculate the number of null object ----*/
	public int findNumberOfNullObjects(Student s []) {
	// write code here 
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i]==null){
					count++;
			}
		}
		return count;
	}
}
