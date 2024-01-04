package javapackage;

public class Hdfc extends Bank  {
	public void current() {
		System.out.println("current account");
	}
	public void salary() {
		System.out.println("savings account");
	}
	public static void main(String[]args) {
		
		Hdfc obj = new Hdfc();
		
		obj.current();
		obj.salary();
		obj.savings();
	
}
	

}
