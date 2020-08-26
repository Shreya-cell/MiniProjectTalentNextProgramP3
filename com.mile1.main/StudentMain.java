//JAVA PROJECT: STUDENT GRADE CALCULATION SYSTEM
package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
public class StudentMain {

	static Student[] data = new Student[10];		//given data
	//public StudentMain() 
	static
	{// Constructor 
		for (int i = 0; i < data. length; i++) {
			data [i]= new Student(); 
		}
		data [0] = new Student ("A1", new int [] {72,73,74});			//given test cases
		data [1] = new Student ("B1", new int [] {75,76,77});
		data [2] = new Student ("C1", new int [] {99,99,99});
		data [3] = new Student ("C3", new int [] {100,100,99});
		data [4]= new Student ("B2", new int [] {13,88,13});
		data [5] = new Student ("C3", new int [] {14,14,99});
		data [6] = new Student ("A2", new int [] {77,55,12});
		data [7] = new Student (null, new int [] {13,88,13});
		data [8] = new Student ("A2", null);
		data[9]= null;
	}
	public static void main(String[] args) {
		StudentReport strep = new StudentReport();		// Reference for Student Report class
		StudentService stser = new StudentService();	// Reference for Student Service class

		System.out.println("Grade Calculation:");
		
		String x = null;
		
		for (int i = 0; i < data.length; i++)  {
			try {
				x = strep.validate(data[i]);
			} catch (NullNameException e) {
				e.printStackTrace();
			} catch (NullMarksArrayException e) {
				e.printStackTrace();
			} catch (NullStudentObjectException e) {
				e.printStackTrace();
			}
			
			System.out.println("GRADE = " + x);
		}
		
		System.out.println("Number of Objects with Marks array as null = " +
								stser.findNumberOfNullMarksArray(data));
		System.out.println("Number of Objects with Name as null = " +
								stser.findNumberOfNullName(data));
		System.out.println("Number of Objects that are entierly null = " +
								stser.findNumberOfNullObjects(data));
	}
		
		
	}
