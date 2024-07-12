package Challenge;

public class Day16 {
    public static void main(String[] args) {
        int a[] = {1, 5, 8, 0, 0, 0};
        int b[] = {3, 6, 9};
        int m = 3, n = 3;
        int i = m - 1, j = n - 1, k = a.length - 1;

        while (j >= 0) {
            if (i >= 0 && a[i] > b[j]) {
                a[k] = a[i]; 
                k--;
                i--;
            } else {
                a[k] = b[j];
                k--;
                j--;
            }
        }

        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index] + " ");
        }
    }
}
