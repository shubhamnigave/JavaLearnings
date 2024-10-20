package com.mess.tester;

import java.util.Scanner;

import com.mess.operation.CustImpl;

public class TestCustomer {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			CustImpl ops=new CustImpl();
			boolean exit=false;
			while(!exit) {
				System.out.println("1.Sign Up\n"
						+ "2.Sign In\n"
						+ "3.Change Password\n"
						+ "4.Sort Customer\n"
						+ "5.Unsubscribe Customer by Duration\n"
						+ "6.Display all\n"
						+ "7.Modify Firstname\n"
						+ "8.Display Email\n"
						+ "9.Display Customer by Plan\n"
						+ "10.Customer Count by Plan\n"
						+ "11.Search by City\n"
						+ "12.Add Discount on Plan "
						+ "0.Exit\n"
						+ "Enter Choice:");
			try {
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter Your Details:- Firstname, Lastname, Email, Password,Address,Phone,Plan(Montly|Quarterly|Yearly),Registration Date,Amount");
					ops.AddCust(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble());
					sc.nextLine();
					break;
				case 2:
					System.out.println("Enter Your Email and Password");
					ops.signIn(sc.next(),sc.next());
					break;
				case 3:
					System.out.println("Enter your Email, Old Password, New Password");
						    
					break;
				case 4:
					System.out.println("Sort Customer as per\r\n"
							+ "1)First Name\r\n"
							+ "2)Last Namer\n"
							+ "3)As per Date of Registration");
					switch(sc.nextInt()) {
					case 1: ops.sortByFirstName();
					break;
					case 2: ops.sortByLastName();
					break;
					case 3: ops.sortByRegistrationDate();
					break;
					default:
						break;
					}
					break;
				case 5:
					System.out.println("Enter Duration in Month");
					ops.unsubsrcibeCust(sc.nextInt());
					break;
				case 6:
					ops.displayAllCustomer();
					break;
				case 7:
					ops.modifyFirstname();
					break;
				case 8:
					System.out.println("Display Email ");
					break;
				case 9:
					System.out.println("Enter Month: eg:May");
				ops.displayEmail(sc.next());
					break;
				case 10:
					System.out.println("Enter plan");
					ops.displayCount(sc.next());
					break;
				case 11:
					System.out.println("Enter City");
					ops.searchSortByCIty(sc.next());
					break;
				case 12:
					System.out.println("Enter Plan and Discount");
					ops.addDiscount(sc.next(),sc.nextDouble());
					break;
				case 0: exit=true;
				break;
				}
			}catch (Exception e) {
			System.out.println(e);
		}
	}
	}
	}
	}
