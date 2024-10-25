package com.cricket.tester;

import java.util.Scanner;

import com.cricket.operation.CricketImpl;

public class tester {

	public static void main(String[] args) {
		boolean exit=false;
		try(Scanner sc=new Scanner(System.in)){
			CricketImpl cr=new CricketImpl();
			while(!exit) {
				System.out.println(" 1.Accept \n 2.Modify \n 3.Search\n 4.Display all\n 5.Display Sorted\n 0.Exit\n Enter Choice: ");
			try {
				switch(sc.nextInt()){
					case 1:
						System.out.println("Enter Your Details- Name,Emailid, Phone, Age");
						cr.Accept(sc.next(),sc.next(),sc.next(), sc.nextInt(),sc.nextInt());
						sc.nextLine();
						break;
					case 2:
						System.out.println("Enter name,email,rating");
						cr.modifyCricketer(sc.next(),sc.next(),sc.nextInt());
						break;	
					case 3:
						System.out.println("Enter Name");
						cr.searchByName(sc.next());
						break;
					case 4:
						System.out.println("Display all Customers");
						cr.displayAll();
						break;
					case 5:
						System.out.println("All Players Sorted");
						cr.cricketerSortedByRating();
					case 0:
						exit=true;
						break;
			}
			
		}catch (Exception e) {
		System.out.println(e);
		}

	}
		}
		
	}
	}
