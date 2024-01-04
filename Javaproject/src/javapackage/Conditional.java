package javapackage;

public class Conditional {
	public static void main (String[]args) {
		int age = 7;
//		if(age>=18) {
//			System.out.println("allow to play IPL");
//		}else {
//			System.out.println("not allow to play IPL");
//		}
		
		switch(age) {
		case 1 :
			System.out.println("mon");
			break;
			
		case 2 :
			System.out.println("tue");
			break;
			
		case 3 :
			System.out.println("wed");
			break;
			
		case 4 :
			System.out.println("thur");
			break;
			
		case 5 :
			System.out.println("fri");
			break;
			
			default :
				System.out.println("no day");
		
		}
		
	}

}
