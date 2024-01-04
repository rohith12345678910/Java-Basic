package javapackage;

public class Son extends Father {
	public void cricket() {
		System.out.println("Dhoni is the cricketer");
	}
	
	public static void main (String[]args) {

		Son obj = new Son();
		
		obj.bussiness();
		obj.cricket();
		obj.properties();
		
		
	}

}
