package com.mess.validation;

import java.time.LocalDate;
import java.util.Map;

import com.mess.core.Customer;
import com.mess.core.MessPlan;
import com.mess.exception.Cust_Exception;

public class CustValidation {
	
//validation for the email format
	public static void validateEmail(String email) throws Cust_Exception{
		if(!email.matches("[A-Z0-9a-z._%+-]@[A-Za-z0-9.-]+\\.[A-Za-z]{2}")) {
			throw new Cust_Exception("Invalid Format, Enter Valid Email ID");
			}
	}
	public static void checkDuplicateCustomer(String email, Map<String, Customer> Mess) throws Cust_Exception {
		if(Mess.containsKey(email)) {
			throw new Cust_Exception("User already Exists");
		}
	}
	public static MessPlan parseValidatePlan(String plan, double final_amount) throws Cust_Exception {
		MessPlan pl=MessPlan.valueOf(plan.toUpperCase());
		if(pl.getFinal_amount()!=final_amount) {
			throw new Cust_Exception("Amount must be according to Plan");
		}
		return pl;
	}
	public static void validatePhone(String phone) throws Cust_Exception {
		if(phone.length()!=10||!phone.matches("^\\d{10}$")){
			throw new Cust_Exception("Invalid Number,Must be 10 Digits");
		}
		}
		public static Customer validateLogin(String email,String password,Map<String, Customer>Mess) throws Cust_Exception {
			Customer c = Mess.get(email);
			if(c==null)
				throw new Cust_Exception("Customer not found please enter valid email");
			if(!c.getPassword().equals(password)) {
				throw new Cust_Exception("Login failed please check password");
			}
			return c;
		}
		public static LocalDate parseLocalDate(String RegisterDate) throws Cust_Exception {
			LocalDate date = LocalDate.parse(RegisterDate);
			if(date.isBefore(LocalDate.now())) {
				throw new Cust_Exception("Register date should be today or after todays date");
			}
			return date;
		
	}
}
