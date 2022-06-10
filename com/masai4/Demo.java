package com.masai4;

import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
//		Students s1 = new Students();
		
		System.out.println("Numbers of student objects");
		int studentCount = input.nextInt();
		
		Students studentArray[] = new Students[studentCount];
		
		for(int i=0; i<studentCount; i++) {
			input.nextLine();
			System.out.println("Enter your name");
			String name = input.nextLine();
//			s1.setName(name);
			
			System.out.println("Enter roll number");
			int roll = input.nextInt();
//			s1.setRoll(roll);
			
			input.nextLine();
			System.out.println("Enter address");
			String address = input.nextLine();
//			s1.setAddress(address);
			
			System.out.println("Enter marks");
			int marks = input.nextInt();
//			s1.setMarks(marks);
			Students s1 = new Students(roll, marks, name, address);
			studentArray[i] = s1;
			 
		}
		
		for(int i=0; i<studentCount; i++) {
			System.out.println("Student name: " + studentArray[i].getName());
			System.out.println("Student address: " + studentArray[i].getAddress());
			System.out.println("Student roll no. : " + studentArray[i].getRoll());
			System.out.println("Student marks: " + studentArray[i].getMarks());
		}
		
		int average;
		int total = 0;
		for(int i=0; i<studentCount; i++) {
			total += studentArray[i].getMarks();
		}
		average = total/studentCount;
		System.out.println(average);
	}
}
