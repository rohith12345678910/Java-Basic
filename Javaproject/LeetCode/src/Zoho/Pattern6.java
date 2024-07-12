package Zoho;

public class Pattern6 {
public static void main(String[] args) {
		
		// Pyramid
		
	int rows=3;
	for(int i=1;i<=rows;i++) {
		for(int j=1;j<=rows-i;j++) {
			
			System.out.print("  ");
		}
		
		for(int z=1;z<=2*i-1;z++) {
			
			 System.out.print("* " );
		}
		System.out.println();
		}
		  
		        for (int i = rows-1; i >= 1; i--) {
		          
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print("  ");
		            }
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print("* ");
		            }

		            System.out.println();
		        }
		
}
}
