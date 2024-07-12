package Challenge;

public class Day5 {
    public static void main(String[] args) {
        int[] a = {5, 7, 8, 2, 3};  
        int max = a[0];            

        for (int i = 1; i < a.length; i++) {  
            if (a[i] > max) {
                max = a[i];  
            }
        }

        System.out.println("Maximum value is: " + max); 
    }
}

