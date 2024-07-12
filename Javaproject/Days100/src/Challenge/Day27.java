package Challenge;

public class Day27 {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 2, 3, 0};
        int c = 1; // Start from index 1 since the first element is always considered as not duplicate

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1] || a[i] == 0) {
                a[c] = a[i];
                c++;
            }
        }

        // Print the array after removing duplicates
        for (int i = 0; i < c; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
