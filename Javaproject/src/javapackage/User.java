package javapackage;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		
		System.out.println("Enter the Name");
	Scanner obj = new Scanner(System.in);
		
		String name = obj.nextLine();
		
		System.out.println("Enter Your Name : "+ name);
		
		// Tables
		
		int number;
		
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		number = sc.nextInt();
		
		for (int i=1;i<=10;i++) {
			System.out.println(number + "*" + i + "="+(number * i));
			
		}
		
		
	}

}