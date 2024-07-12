package Challenge;
import java.util.*;

public class Day2 {
	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();	
		
		System.out.println("Number : "+number );
		
		if(number%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
				
	}

}
