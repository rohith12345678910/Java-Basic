package Challenge;
public class Day18 {
    public static void main(String[] args) {
        int[] a = {2, 3, 7, 8, 9, 10};
        int i = 0;
        int j = 1;
        while (i < a.length && j < a.length) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i = i + 2;
            j = j + 2;
        }
        
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
