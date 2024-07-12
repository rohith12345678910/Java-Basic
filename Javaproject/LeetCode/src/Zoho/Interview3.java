package Zoho;
import java.util.Scanner;
public class Interview3 {
	
	
	    public static void main(String[] args) {
	        // Define the array
	        int[] a = {0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1};
	        
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a number
	        System.out.println("Enter the number of consecutive occurrences to find: ");
	        int numConsecutive = scanner.nextInt();

	        // Call the method to find the number of consecutive occurrences
	        int count = findConsecutiveOccurrences(a, numConsecutive);
	        
	        // Print the result
	        System.out.println("Number of sequences of " + numConsecutive + " consecutive occurrences: " + count);
	        
	        // Close the scanner
	        
	    }
	    
	    // Method to find the number of consecutive occurrences
	    static int findConsecutiveOccurrences(int[] arr, int numConsecutive) {
	        // Initialize count to store the number of consecutive occurrences found
	        int count = 0;
	        
	        // Iterate through the array elements
	        for (int i = 0; i <= arr.length - numConsecutive; i++) {
	            // Check if the next 'numConsecutive' elements are the same
	            int j;
	            for (j = 1; j < numConsecutive; j++) {
	                if (arr[i] != arr[i + j]) {
	                    j = numConsecutive; // Stop the loop if a mismatch is found
	                }
	            }
	            
	            // If 'j' equals 'numConsecutive', it means all elements in the sequence match
	            if (j == numConsecutive) {
	                count++;
	            }
	        }
	        
	        // Return the count of sequences of consecutive occurrences found
	        return count;
	    }
	}
