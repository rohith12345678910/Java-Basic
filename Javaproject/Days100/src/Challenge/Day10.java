package Challenge;


public class Day10 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 3;
        int n = a.length; // Define 'n' properly to use it in the code

        // Reverse the first part of the array
        reverse(a, 0, k - 1);
        // Reverse the second part of the array
        reverse(a, k, n - 1);
        // Reverse the entire array
        reverse(a, 0, n - 1);

        // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Method to reverse elements of the array from index 'start' to 'end'
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

