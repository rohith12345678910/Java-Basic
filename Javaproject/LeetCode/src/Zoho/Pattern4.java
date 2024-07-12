package Zoho;

public class Pattern4 {
	
	    public static void main(String[] args) {
	        int numberOfRows = 6;  // The total number of rows to print

	        // Loop to handle each row
	        for (int row = 0; row < numberOfRows; row++) {
	            // Get the current character starting with 'A'
	            char currentChar = (char) ('A' + row);

	            // Print the current character row times
	            for (int col = 0; col <= row; col++) {
	                System.out.print(currentChar);
	            }

	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
	}


