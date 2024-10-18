package com.student.StudentOperation;
import com.student.StudentException.StudentException;
import com.student.core.Student;

public interface StudentRegistration {

	//public void getStudent(int PRN) throws StudentException;

	public void AcceptStudent(int PRN, String firstName, String lastName,String courseType, String dob, boolean confirmAdmission)throws StudentException;
	public void displayDetails();

	}
	
