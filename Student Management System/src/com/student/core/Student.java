package com.student.core;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	private int PRN;
	private String FirstName;
	private String LastName;
	private LocalDate dob;
	private Course courseType;
	private boolean confirmAdmission;
	public Student(int PRN, String firstName, String lastName, LocalDate dob, Course courseType, boolean confirmAdmission) {
		super();
//		PRN = PRN;
		FirstName = firstName;
		LastName = lastName;
		this.dob = dob;
		this.courseType=courseType;
	}
	

	public int getPRN() {
		return PRN;
	}


	public String getFirstName() {
		return FirstName;
	}


	public String getLastName() {
		return LastName;
	}


	public LocalDate getDob() {
		return dob;
	}


	public Course getCourseType() {
		return courseType;
	}
	


	public void setPRN(int pRN) {
		PRN = pRN;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Student [PRN=" + PRN + ", FirstName=" + FirstName + ", LastName=" + LastName + ", dob=" + dob
				+ ", courseType=" + courseType + ", confirmAdmission=" + confirmAdmission + "]";
	}
	
	
	
}
