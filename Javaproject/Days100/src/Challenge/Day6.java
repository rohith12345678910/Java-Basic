package Challenge;

public class Day6 {
    public static void main(String[] args) {
        int[] a = {5, 7, 8, 2, 3};
        int i = 0;
        int j = a.length - 1;

        // Reverse the array
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        // Print the reversed array using a traditional for-loop
        System.out.println("Reversed array:");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
