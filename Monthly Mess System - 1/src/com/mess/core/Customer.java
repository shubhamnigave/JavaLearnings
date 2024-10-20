package com.mess.core;

import java.time.LocalDate;

public class Customer {

	private static int idCounter;
	private int custid;
	private String firstname,lastname,email,password,Address,phone;
	private LocalDate RegisterDate,planEndDate;
	private MessPlan plan;
	private double final_amount;
	
	public Customer( String firstname, String lastname, String email, String password, String address,
			String phone, LocalDate registerDate, LocalDate planEndDate, MessPlan plan, double final_amount) {
		super();
		this.custid = ++idCounter;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		Address = address;
		this.phone = phone;
		RegisterDate = registerDate;
		this.planEndDate = planEndDate;
		this.plan = plan;
		this.final_amount = final_amount;
	}
	
	public static int getIdCounter() {
		return idCounter;
	}

	public int getCustid() {
		return custid;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return Address;
	}

	public String getPhone() {
		return phone;
	}

	public LocalDate getRegisterDate() {
		return RegisterDate;
	}

	public LocalDate getPlanEndDate() {
		return planEndDate;
	}

	public MessPlan getPlan() {
		return plan;
	}
	
	public static void setIdCounter(int idCounter) {
		Customer.idCounter = idCounter;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setRegisterDate(LocalDate registerDate) {
		RegisterDate = registerDate;
	}

	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}

	public void setPlan(MessPlan plan) {
		this.plan = plan;
	}
	public double getFinal_amount() {
		return final_amount;
	}

	public void setFinal_amount(double final_amount) {
		this.final_amount = final_amount;
	}



	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", Address=" + Address + ", phone=" + phone + ", RegisterDate="
				+ RegisterDate + ", planEndDate=" + planEndDate + ", plan=" + plan + ", final_amount=" + final_amount
				+ "]";
	}
	
}
