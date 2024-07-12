package Zoho;

public class Pattern3 {
	
	    public static void main(String[] args) {
	        int width = 23;  // Width of the rectangle
	        int height = 5;  // Height of the rectangle

	        // Loop through each row
	        for (int row = 1; row <= height; row++) {
	            if (row == 1 || row == height) {
	                // Print solid line for the top and bottom
	                printFullLine(width);
	            } else {
	                // Print hollow line for the middle rows
	                printHollowLine(width);
	            }
	        }
	    }

	    // Method to print a solid line of asterisks
	    private static void printFullLine(int width) {
	        for (int i = 0; i < width; i++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	    // Method to print a hollow line with asterisks at the boundaries
	    private static void printHollowLine(int width) {
	        System.out.print("*"); // Print starting asterisk
	        for (int i = 1; i < width - 1; i++) {
	            System.out.print(" "); // Print spaces in the middle
	        }
	        System.out.println("*"); // Print ending asterisk
	    }
	}


