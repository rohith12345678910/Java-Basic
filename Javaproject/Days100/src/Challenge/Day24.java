package Challenge;

public class Day24 {

	  public static void main(String[] args) {
	        int row = 6;  
	        
	        for (int i = 0; i <row; i++) {
	           
	            char currentChar = (char) ('A' + i);
	            
	            for (int j = 0; j <= i; j++) {
	                System.out.print(currentChar++);
	                
	            }
	          
	            System.out.println();
	        }
	    }
	}

