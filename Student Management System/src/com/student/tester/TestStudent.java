package com.student.tester;

import java.util.Scanner;
import com.student.StudentException.StudentException;
import com.student.StudentOperation.StudentOperationImpl;
import com.student.StudentOperation.StudentRegistration;

public class TestStudent {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StudentRegistration ops = new StudentOperationImpl();
            boolean exit = false;
            while (!exit) {
                System.out.println("Options \n1. Register Student \n"
                        + "2. Display All Students \n"
                        + "0. Exit");
                try {
                    switch (sc.nextInt()) {
                        case 1:
                            System.out.println("Enter the Student details PRN, First Name, Last Name,Date of Birth," +
                                    " Course type and Admission Confirmation(Yes/No");
                            ops.AcceptStudent(sc.nextInt(), sc.next(), sc.next(), sc.next(),sc.next(),sc.nextBoolean());
                            break;
                        case 2:
                            ops.displayDetails();
                            break;
                        case 0:
                            exit = true;
                            break;
                    }
                } catch (StudentException e) {
                    throw new RuntimeException(e);
                }

            }

        }
    }
}
