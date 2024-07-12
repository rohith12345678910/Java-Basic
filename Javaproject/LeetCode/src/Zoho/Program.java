package Zoho;

//public class Program {
//	
//	    public static void main(String[] args) {
//	        String s = "programming";
//	        char[] str = s.toCharArray();
//	        int[] charCount = new int[256]; // ASCII character set
//
//	        // Count the occurrence of each character
//	        for (int i = 0; i < str.length; i++) {
//	            charCount[str[i]]++;
//	        }
//
//	        System.out.println("Repeating characters:");
//	        for (int i = 0; i < str.length; i++) {
//	            if (charCount[str[i]] > 1) {
//	                System.out.println(str[i]);
//	                charCount[str[i]] = 0; // Ensure each character is printed only once
//	            }
//	        }
//
//	        System.out.println("Non-repeating characters:");
//	        for (int i = 0; i < str.length; i++) {
//	            if (charCount[str[i]] == 1) {
//	                System.out.println(str[i]);
//	            }
//	        }
//	    }
//	}



public class Program {
    public static void main(String[] args) {
        String s = "madam";
        char[] str = s.toCharArray();

        System.out.println("Repeating characters:");
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    System.out.println(str[i]);
                }
            }
        }

        System.out.println("Non-repeating characters:");
        for (int i = 0; i < str.length; i++) {
            boolean found = false;
            for (int j = 0; j < str.length; j++) {
                if (i != j && str[i] == str[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(str[i]);
            }
        }
    }
}



