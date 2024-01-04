package javapackage;

public class Stringer {
	public static void main (String[]args) {
		
		//  charat() string method Example
				
     	String color = "Black";
		
		char result = color.charAt(0);
		System.out.println(result);
		
		// concat()
		
		String name = "Rohith";
		String last = "Sivakumar";
		String resultt=name.concat(last);
		System.out.println(resultt);
		
		//contains
		
		String first = "rohith";
		System.out.println(first.contains("c"));
		System.out.println(first.contains("r"));
		
		//indexPf()
		
		String firstt = "Black is my Favourite color";
		System.out.println(firstt.indexOf("c"));
		
		//toLowerCase()
		//toUpperCase()
		
		String fast = "Black is my Favourite color";
		System.out.println(fast.toLowerCase());
		System.out.println(fast.toUpperCase());
		
		
	//length()
		String fastt = "Black is my Favourite color";
		System.out.println(fast.length());
		
		//isEmPTY()
       String name1 = "";
       String name2 ="Rohith";
       System.out.println(name1.isEmpty());
       
       //replace()

       String names1="black is my black favourite color";
       
       System.out.println(names1.replaceAll("black","White"));
       System.out.println(names1.replaceFirst("black","White"));
       System.out.println(names1.replace("black","White"));
       
	}

}
