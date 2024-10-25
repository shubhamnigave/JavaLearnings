package com.cricket.operation;

import com.cricket.Exception.Cricket_Exception;

public interface CricketOperation {

	// Accept Cricketer details and add to the map
	public void Accept(String name,String emailid,String phone,int age,int rating) 
			throws Cricket_Exception;

	public void searchByName(String name) throws Cricket_Exception;

	public void sortByRating(int rating) throws Cricket_Exception;

	public void modifyCricketer(String name, String email, int rating) throws Cricket_Exception;

	public void displayAll();

	public void cricketerSortedByRating();
}
