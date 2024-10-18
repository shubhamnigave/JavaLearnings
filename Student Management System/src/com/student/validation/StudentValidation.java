package com.student.validation;

import java.time.LocalDate;

import com.student.StudentException.StudentException;
import com.student.core.Course;

public class StudentValidation {
	public static void validateDob(String dob) throws StudentException{
		LocalDate date=LocalDate.parse(dob);
		LocalDate minDate=LocalDate.of(1985,1,1);
		if(date.isBefore(minDate)) {
			throw new StudentException("DOB must be after 1 JAnuary 1985");
		}
	}
	public static Course validateCourse(String course) throws StudentException{
		if (course==null)
			throw new StudentException("Course Cannot be NULL");
		return Course.valueOf(course.toUpperCase());
	}
	}
