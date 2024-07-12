package Challenge;
public class Day11 {
    public static void main(String[] args) {
        int[] a = {2, 3, 9, 7, 9, 8, 5};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > first) {
                second = first;  
                first = a[i];   
            } else if (a[i] > second && a[i] != first) {  
                second = a[i]; 
            }
        }

        System.out.println("The second largest number is: " + second);
    }
}


