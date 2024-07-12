package Challenge;

public class Day14 {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 7};
        int j = 0; 
        for (int i = 1; i < a.length; i++) { 
            if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
        }
        System.out.print("{");
        for (int k = 0; k <= j; k++) {
            System.out.print(a[k]);
            if (k < j) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}

