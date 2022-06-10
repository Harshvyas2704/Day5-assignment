package com.masai;

import java.util.Scanner;

public class Main {

	public static Employee getEmployeeDetails() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int id = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter Employee name");
		String name = input.nextLine();
		
		System.out.println("Enter Employee salary");
		int salary = input.nextInt();
		
		Employee e1 = new Employee();
		e1.setEmployeeId(id);
		e1.setEmployeeName(name);
		e1.setSalary(salary);
		return e1;
	}
	
	public static int getPFPercentage() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter pfpercentage:");
		int pfp = input.nextInt();
		return pfp;
		
	}
	
	public static void main(String[] args) {
		
		Employee e1 = Main.getEmployeeDetails();
		
		int pfp = Main.getPFPercentage();
		e1.calculateNetSalary(pfp);
		
		
		
		System.out.println("ID is: " + e1.getEmployeeId());
		System.out.println("Name is: " + e1.getEmployeeName());
		System.out.println("Salary is: "  + e1.getSalary());
		System.out.println("Net salaray is: " + " " + e1.getNetSalary());
		
		
		
	}
}
