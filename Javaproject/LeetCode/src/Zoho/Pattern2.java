package Zoho;

public class Pattern2 {
	

	    public static void main(String[] args) {
	        int maxStars = 6; // The maximum number of stars in the middle of the pattern

	        // Print the increasing part of the pattern
	        for (int i = 1; i <= maxStars; i++) {
	            printStars(i);
	        }

	        // Print the decreasing part of the pattern
	        for (int i = maxStars - 1; i >= 1; i--) {
	            printStars(i);
	        }
	    }

	    // Helper method to print the specified number of stars
	    private static void printStars(int n) {
	        for (int i = 0; i < n; i++) {
	            System.out.print("*");
	        }
	        System.out.println(); // Move to the next line
	    }
	}

