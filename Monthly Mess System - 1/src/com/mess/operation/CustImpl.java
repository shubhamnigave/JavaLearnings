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
//Added Some HardCode Entries in Map
//String firstname,String lastname,String email,String password,
//String address,String phone,String RegisterDate,String planEndDate,String plan,double final_amount
Customer c1 = new Customer("Shubham", "Nigave", "shubh.nigave@example.com", "password123", 
                 "Pune", "5551234567", LocalDate.of(2024, 1, 10),LocalDate.of(2024, 10, 17), com.mess.core.MessPlan.MONTHLY, 5000);
Customer c2 = new Customer("Gaurav", "Gole", "gaurav.gole@example.com", "123Pass", 
                 "Kolhapur", "5559876543", LocalDate.of(2024, 2, 15), LocalDate.of(2025, 2, 15),com.mess.core.MessPlan.QUARTERLY, 10000);
Customer c3 = new Customer("Michael", "Johnson", "michael.j@example.com", "mjPass", 
                 "789 Oak Dr", "5556543210",LocalDate.of(2024, 3, 20), LocalDate.of(2025, 3, 20),com.mess.core.MessPlan.HALFYEAR, 87856);
Customer c4 = new Customer("Emily", "Davis", "emily.davis@example.com", "emilyPass", 
                                   "987 Pine St", "5553210987",LocalDate.of(2024, 4, 25), LocalDate.of(2025, 4, 25), com.mess.core.MessPlan.YEARLY, 465465);
Customer c5 = new Customer("Chris", "Miller", "chris.miller@example.com", "chrisPass",         
                 "654 Cedar Rd", "5555678901",LocalDate.of(2024, 5, 30), LocalDate.of(2025, 5, 30),com.mess.core.MessPlan.MONTHLY, 32345);
Customer c6 = new Customer("Sarah", "Wilson", "sarah.wilson@example.com", "sarahPass", 
                 "321 Elm St", "5556781234", LocalDate.of(2024, 6, 10), LocalDate.of(2025, 6, 10), com.mess.core.MessPlan.QUARTERLY, 9865);

		Mess.put(c1.getEmail(), c1);
		Mess.put(c2.getEmail(), c2);
		Mess.put(c3.getEmail(), c3);
		Mess.put(c4.getEmail(), c4);
		Mess.put(c5.getEmail(), c5);
		Mess.put(c6.getEmail(), c6);
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
