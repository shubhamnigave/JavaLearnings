package com.pen.tester;

import java.util.Scanner;

import com.pen.operation.PenImpl;

public class LaunchPen {

	public static void main(String[] args) {
		try (
			Scanner sc= new Scanner(System.in)){
			PenImpl ops=new PenImpl();
			boolean exit =false;
			while(!exit) {
				try {
					System.out.println("1.Add Pen 2.Update Stock  3.Set Discount  4.Remove Pens 5.Exit");
					int ch=sc.nextInt();
					switch(ch) {
					case 1: System.out.println("Add Pen Details :- Brand ,color, material, quantity,price");
					System.out.println(ops.addPen(sc.next(),sc.next(),sc.next(),sc.nextInt(), sc.nextInt()));
					}
			
		}catch (Exception e) {
		System.out.println(e);

	}

		}
	}}}
