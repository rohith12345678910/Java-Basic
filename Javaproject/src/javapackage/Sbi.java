package javapackage;

public class Sbi implements Banking {
	public void salary() {
		System.out.println("salary");
	}
	public void current() {
		System.out.println("current");
	}
	public void Rohith() {
		System.out.println("Rohith is a bad boy");
	}
	
	public static void main(String[]args) {
		Sbi obj = new Sbi();
		
		obj.current();
		obj.salary();
		obj.Rohith();
	}
	

}
