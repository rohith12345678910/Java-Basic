package Challenge;

public class Day36 {

	    public static void main(String[] args) {
	        int rows = 5; 
	        printPascalTriangle(rows);
	    }

	    public static void printPascalTriangle(int rows) {
	        for (int i = 0; i < rows; i++) {
	            int number = 1;
	            
	            for (int k = 0; k < rows - i; k++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j <= i; j++) {
	                System.out.print(number + " ");
	            
	                number = number * (i - j) / (j + 1);
	            }
	            System.out.println();
	        }
	    }
	}


