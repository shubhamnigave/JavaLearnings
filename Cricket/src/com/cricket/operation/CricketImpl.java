package com.cricket.operation;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.cricket.Exception.Cricket_Exception;
import com.cricket.cricketer.Cricketer;
import static com.cricket.validation.Validation.*;
public class CricketImpl implements CricketOperation {
	private Map<String,Cricketer>Cricket;
	public CricketImpl() {
		Cricket=new HashMap<String,Cricketer>();
		//Hard Codes the Cricketer Details
		Cricketer c1 = new Cricketer("John","john.doe@example.com", "11111", 22,6);
		Cricketer c2 = new Cricketer("Jane","jane.smith@example.com", "22222", 23,7);
		Cricketer c3 = new Cricketer("Alice", "alice.johnson@example.com", "33333", 24,8);
		Cricketer c4 = new Cricketer("Bob","bob.brown@example.com", "44444", 26,9);
		
		Cricket.put(c1.getName(),c1);
		Cricket.put(c2.getName(),c2);
		Cricket.put(c3.getName(),c3);
		Cricket.put(c4.getName(),c4);
}
	@Override
	public void Accept(String name,String emailid,String phone,int age,int rating ) throws Cricket_Exception{
		String Email=validateEmail(emailid);
		int Age=validateAge(age);
		String Phone=validatePhone(phone,Cricket);
		Cricket.put(Email, new Cricketer(name,Email,Phone,Age,rating));
		System.out.println("Player Added");
	}	
	@Override
	public void searchByName(String name) throws Cricket_Exception{
		Cricket.values().stream().filter(c->c.getName().equals(name)).forEach(c->System.out.println(c));
	}
	@Override
	public void sortByRating(int rating) throws Cricket_Exception{
		Cricket.values().stream().sorted(Comparator.comparingInt(Cricketer::getRating).reversed()).forEach(c->System.out.println(c));
	}
	@Override
	public void modifyCricketer(String name, String email, int rating) throws Cricket_Exception {
		// TODO Auto-generated method stub
		String key=validateEmail(email).concat(name);
		Cricketer c=Cricket.get(key);
		if(c==null)
			throw new Cricket_Exception("Cricketer not Found");
		c.setRating(rating);
		Cricket.replace(key, c);
	}
	@Override
	public void displayAll() {
		Cricket.values().forEach(s->System.out.println(s));
	}
	@Override
	public void cricketerSortedByRating() {
		Cricket.values().stream().sorted(Comparator.comparing(Cricketer::getRating).reversed()).forEach(c->System.out.println(c));
		
	}
	
	
}
