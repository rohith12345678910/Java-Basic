package javapackage;

import java.util.Scanner;

public class Task1 {
	public static void main(String[]args) {
	
		        
		        int year = 2024;

		        if (year % 4 == 0) {
		            System.out.println(year + " is a leap year.");
		        } else {
		            System.out.println(year + " is not a leap year.");
		        }
		
		       
		        for (int i=0; i<=30; i++) {
		        if (i % 2==0) {
		        	
		        	System.out.println(i);
		        }

		    }
		        
		        // To find natural of 1+2+....+15
		       
		        int sum = 0;
		        for (int i=0; i<=15; i++) {
		        	sum = sum+i;
		           
		        }
		        	System.out.println("natural number of 15 is : "+ sum);
		        	
		        	
		        	
		        	// To find Factorial of  6!
		        	
		        	
		        	int fact=1;int n=6, k;
		        	for(k=1;k<=n;k++) {
		        		fact=fact*k;
		        	}
		        	System.out.println(fact);
		        	
		        	
		        	// 2 Tables
		        	
		        	for (int i=1; i<=10;i++) {
		        		System.out.println(i+"*2="+i*2);
		        	}
		        	
		        	//Reverse palindrome
		     
		        	int number;
		        	System.out.println("Enter the number");
		        	Scanner obj = new Scanner(System.in);
		        	
		        	number = obj.nextInt();
		        	
		        	int i=0, j=number;
		        	while(j!=0) {
		        		int remainder=j%10;
		        		i= i * 10 + remainder;
		        		j=j/10;
		        	}
		        	
		        	System.out.println("Reverse number is : "+ i);
		        	
		        	if(number==i){
		        		
		        		System.out.println("Its is a Palindrome Number");
		        	}
		        	else {
		        		
		        		System.out.println("Its not a Palindrome Number");
		        	}
	}

}



      