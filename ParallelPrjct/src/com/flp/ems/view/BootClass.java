package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.Add");
		System.out.println("2.Modify");
		System.out.println("3.Remove");
		System.out.println("4.Search");
		System.out.println("5.Display");
		
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		 
		
		menuSelection(i);
	}


public static void menuSelection(int j)
{
	UserInteraction us=new UserInteraction(); 
	switch (j){
	case 1:
			us.AddEmployee();
	
	case 2:
	       us.ModifyEmployee();
	       
	case 3:
		us.RemoveEmployee();
		
	case 4:
		us.SearchEmployee();
		
	case 5:
		us.getAllEmployee();
	}
	
		
	
	
}
}