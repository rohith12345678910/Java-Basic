package javapackage;

public class Studentdata {

	public void student(int id) {
		
		System.out.println(id);		
	}
public void student(String name) {
	System.out.println(name);		
	}
public void student(float salary) {
	System.out.println(salary);		
}
public void student(long number) {
	System.out.println(number);
}
	public static void main(String[]args) {
		Studentdata obj = new Studentdata();
		obj.student(07);
		obj.student("Rohith");
		obj.student(25000);
		obj.student(8939130347l);
		
	}
}
