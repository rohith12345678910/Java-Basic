package Challenge;

public class Day7 {
    public static void main(String[] args) {
        
        int[] a = {5, 4, 1, 6, 2};

        int n = 6;
        int sum = 0;

        int total = (n * (n + 1)) / 2;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        int num =total-sum;

        System.out.println("Missing Element is: " + num);
    }
}
