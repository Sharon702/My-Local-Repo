package com.flp.ems.view;

import java.util.Scanner;

public class UserInteraction {
	
	void AddEmployee()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Name");
		String name = sc.next();
		
		System.out.println("Enter the Employee ID");
		int id= sc.nextInt();
		
		System.out.println("Enter the Email ID");
		String email=sc.next();
		
		System.out.println("Enter the Phone number");
		int phn=sc.nextInt();
		
		System.out.println("Enter the Address");
		String addr=sc.next();
		
		System.out.println("Enter the Date of Birth");
		String dob = sc.next();
		
		System.out.println("Enter the Date of joining");
		String doj = sc.next();

	}
    void	ModifyEmployee()
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the Employee Name");
		String name = sc.next();
		
		System.out.println("Enter the Employee ID");
		int id= sc.nextInt();
		
	    }
	void RemoveEmployee()
	{
         Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the Employee Name");
		String name = sc.next();
		
		System.out.println("Enter the Employee ID");
		int id= sc.nextInt(); 
	}
	void SearchEmployee()
	{
        Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the Employee Name");
		String name = sc.next();
		
		System.out.println("Enter the Employee ID");
		int id= sc.nextInt();
		
		System.out.println("Enter the Email ID");
		String email=sc.next();
	}
	void getAllEmployee(){}
}
