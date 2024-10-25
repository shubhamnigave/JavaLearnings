package com.cricket.cricketer;

public class Cricketer {
private String name,emailid,phone;
private int age,rating;

public Cricketer(String name, String emailid, String phone, int age, int rating) {
	super();
	this.name = name;
	this.emailid = emailid;
	this.phone = phone;
	this.age = age;
	this.rating = rating;
}

@Override
public String toString() {
	return "Cricketer [name=" + name + ", emailid=" + emailid + ", phone=" + phone + ", age=" + age + ", rating="
			+ rating + "]";
}

public String getName() {
	return name;
}

public String getEmailid() {
	return emailid;
}

public String getPhone() {
	return phone;
}

public int getAge() {
	return age;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}


}

