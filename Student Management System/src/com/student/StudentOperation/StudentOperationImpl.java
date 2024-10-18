package com.student.StudentOperation;
import static com.student.validation.StudentValidation.validateCourse;
import static com.student.validation.StudentValidation.validateDob;


import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.student.StudentException.StudentException;
import com.student.core.Course;
import com.student.core.Student;

public class StudentOperationImpl implements StudentRegistration {
	private Map<Integer, Student>	SMS;
	public StudentOperationImpl() {
	SMS=new HashMap<>();
	}
	@Override
	public void AcceptStudent(int PRN, String firstName, String lastName,
			String dob,String courseType,boolean confirmAdmission)throws StudentException{
		validateDob(dob);
		validateCourse(courseType);
		LocalDate date=LocalDate.parse(dob);
		Course coursetype=Course.valueOf(courseType.toUpperCase());
		
		Student student=new Student(PRN,firstName,lastName,date,coursetype,confirmAdmission);
		SMS.put(PRN, student);
		System.out.println("Student Added"+student);
	}
	@Override
	public void displayDetails() {
		for(Student student :SMS.values()) {
			System.out.println(student);
		}
		
	}
	}
	
	
	
	
	
//	}
//		@Override
//		public void removeStudent(int PRN) throws StudentException{
//			if(SMS.remove(PRN)==null) {
//				throw new StudentException("No Student Found with PRN"+PRN);
//			}else 
//				System.out.println("Student with "+PRN+" Removed Successfully");
//	}
		
		
//		public void validateCourse(String course) throws StudentException{
//			if(course==null) {
//			throw new StudentException("Course must be Valid");
//			}
			
			
	
	
	

