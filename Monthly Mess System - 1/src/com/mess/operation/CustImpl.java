package com.mess.operation;
import static com.mess.validation.CustValidation.checkDuplicateCustomer;
import static com.mess.validation.CustValidation.parseValidatePlan;
import static com.mess.validation.CustValidation.validateEmail;
import static com.mess.validation.CustValidation.validateLogin;
import static com.mess.validation.CustValidation.validatePhone;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.mess.core.Customer;
import com.mess.core.MessPlan;
import com.mess.exception.Cust_Exception;
public class CustImpl implements MessOperation{
	private Map<String,Customer>Mess;
	public CustImpl() {
		Mess=new HashMap<>();

	}
	
	@Override
	public void AddCust(String firstname,String lastname,String email,String password,
			String address,String phone,String RegisterDate,String planEndDate,String plan,double final_amount)throws Cust_Exception{
		//email Validation
		validateEmail(email);
		checkDuplicateCustomer(email,Mess);
		MessPlan pl=parseValidatePlan(plan,final_amount);
		validatePhone(phone);
		LocalDate date=LocalDate.parse(RegisterDate);
		LocalDate date2=LocalDate.parse(planEndDate);
		Mess.put(email,new Customer(firstname,lastname,email,password,address,phone,date,date2,pl,final_amount));
		System.out.println("Customer Registered Successfully");	
	}
	@Override
	public Customer signIn(String email,String password) throws Cust_Exception{
		validateEmail(email);
		Customer c=validateLogin(email, password, Mess);
		System.out.println("Login Successful");
		return c;
	}
	@Override
	public void displayAllCustomer() {
		Mess.values().forEach(c->System.out.println(c));
	}
	@Override
	public void sortByFirstName() {
		Mess.values().stream().sorted(Comparator.comparing(Customer::getFirstname)).forEach(c->System.out.println(c));
		
	}
	@Override
	public void sortByLastName() {
		Mess.values().stream().sorted(Comparator.comparing(Customer::getLastname)).forEach(c->System.out.println(c));
		
	}
	@Override
	public void sortByRegistrationDate() {
		Mess.values().stream().sorted(Comparator.comparing(Customer::getRegisterDate)).forEach(c->System.out.println(c));
		
	}
	@Override
	public void unsubsrcibeCust(int nextInt) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void modifyFirstname() {
		// TODO Auto-generated method stub
		for(Customer c:Mess.values()) {
			String s=c.getFirstname().substring(0,1).toUpperCase()+c.getFirstname().substring(1);
		}
	}
	@Override
	public void displayEmail(String next) {
		// TODO Auto-generated method stub
		
	}

	public void displayCount(String next) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void searchSortByCIty(String next) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addDiscount(String next, double nextDouble) {
		// TODO Auto-generated method stub
		
	}
	
}
