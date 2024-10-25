package com.cricket.validation;

import java.util.Map;

import com.cricket.Exception.Cricket_Exception;
import com.cricket.cricketer.Cricketer;

public class Validation {
	public static String validateEmail(String emailid) throws Cricket_Exception {
		if(emailid.matches("^[a-zA-Z0-9]+@[a-z]+\\.(com|net|org)")==false)
			throw new Cricket_Exception("Invalid Email Address");
		return emailid;
	}
	
	public static int validateAge(int age) throws Cricket_Exception {
		if(age<18)
			throw new Cricket_Exception("Age Should be Greater than 18");
		return age;
}
	
	public static String validatePhone(String phone,Map<String, Cricketer> Cricket) throws Cricket_Exception  {
	if(!phone.matches("^\\d{10}$") || phone.length()!=10)
			throw new Cricket_Exception("Phone no must consist 10 digits");
	for(Cricketer c : Cricket.values()) {
		if(c.getPhone().equals(phone))
			throw new Cricket_Exception("Phone no already exists");
	}
		return phone;
	}
}
