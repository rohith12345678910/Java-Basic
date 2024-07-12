package Zoho;

import java.util.Scanner;
public class Interview1 {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
	
	Scanner obj = new Scanner(System.in);
	
	String number = obj.next();
	
	System.out.println("Enter the number :" );
	int number1 = obj.nextInt();
	//obj.nextLine();
	
	System.out.println("Enter the name : ");
	String number2 = obj.next();
	
	
	System.out.println("Enter Your Number : "+ number);
	System.out.println("Enter Your Number : "+ number1);
	System.out.println("Enter Your Name : "+ number2);
}
}