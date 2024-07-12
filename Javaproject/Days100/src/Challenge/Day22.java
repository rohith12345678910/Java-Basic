package Challenge;

public class Day22 {
	    public static void main(String[] args) {
	        
	        int num = 9;
	        
	        for (int i = num; i >= 1; i--) {
	            printLine(i);
	        }

	        for (int i = 2; i <= num; i++) {
	            printLine(i);
	        }
	    }

	    private static void printLine(int n) {
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i);
	        }
	        System.out.println(); 
	    }
	}


