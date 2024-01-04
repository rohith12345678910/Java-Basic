package javapackage;
import java.util.Arrays;

//Array methods

public class Nonprimitive {
	public static void main(String[]args) {
		String [] color = {"Black","pink","yellow","blue"};
		System.out.println(Arrays.toString(color));
		System.out.println(color[0]);
		
		// Breaking statement 
		
		for (int i = 0; i<=10;i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		
		for (int i = 0; i<=10;i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
