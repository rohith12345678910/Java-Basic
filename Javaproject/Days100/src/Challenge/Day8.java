package Challenge;

public class Day8 {
    public static void main(String[] args) {
        
        int[] a = {2, 2, 1, 4, 1};

        
        int num = 0;

        
        for (int i = 0; i < a.length; i++) {
            num = num ^ a[i];
        }

        
        System.out.println("Result of XOR operation: " + num);
    }
}

