package Challenge;

public class Day4 {
	public static void main(String[] args) {
		int a=15,b=50,c=7;
		
		if(a>b && a>c) {
			System.out.println("A is Biggest");
		}else if(a<b && b>c) {
			System.out.println("B is Biggest");
		}else {
			System.out.println("C is Biggest");
		}
	}

}
