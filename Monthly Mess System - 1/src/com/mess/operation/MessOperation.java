package com.mess.operation;

import com.mess.core.Customer;
import com.mess.exception.Cust_Exception;

public interface MessOperation {
	/*
	 * 1. Sign up Customer
	2. If already register then sign in
	3. Change Password 
	4. Sort Customer as per 
	A) First name 
	B) According to plan
	C) According to date of registration
	(Imperative/Declarative way)
	5. Unsubscribe customer according plan duration (month wise (1, 3, 6, 12))
	6. Display all Customers
	7) Modify all customers first name (make first Letter capital of customer�s first 
	name)
	8) Display email addresses of the customers who did registration in month of 
	January
	10) Display count of the Customers who have register for plan: Monthly
	11) Search the Customer who lived in Akurdi.
	12) Give the 20% discount to the customers who have selected plan for 1 year
	 * 
	 * */
	void AddCust(String firstname, String lastname, String email, String password, String address, String phone,
			String RegisterDate, String planEndDate, String plan, double final_amount) throws Cust_Exception;
	void displayAllCustomer();
	Customer signIn(String email, String password) throws Cust_Exception;
	void sortByFirstName();
	void sortByLastName();
	void sortByRegistrationDate();
	void modifyFirstname();
	void unsubsrcibeCust(int month);
	void displayEmail(String month);
	void displayCount(String plan);
	void searchSortByCIty(String city);
	void addDiscount(String plan, double discount);

}

