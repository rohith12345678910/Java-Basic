package Zoho;

public class Pattern1 {
	

	    public static void main(String[] args) {
	        // Define the maximum number of digits in the largest line
	        int maxDigits = 9;

	        // Loop to print the decreasing part of the pattern
	        for (int i = maxDigits; i >= 1; i--) {
	            printLine(i);
	        }

	        // Loop to print the increasing part of the pattern
	        for (int i = 2; i <= maxDigits; i++) {
	            printLine(i);
	        }
	    }

	    // Helper method to print numbers from 1 to n
	    private static void printLine(int n) {
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i);
	        }
	        System.out.println(); // Move to the next line
	    }
	}


