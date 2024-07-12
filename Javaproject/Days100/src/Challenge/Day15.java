package Challenge;

public class Day15 {
    public static void main(String[] args) {
        int a[] = {2, 4, 9};
        int b[] = {3, 6, 8, 10};
        int ans[] = new int[a.length + b.length]; 
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k] = a[i]; 
                i++;
            } else {
                ans[k] = b[j]; 
                j++;
            }
            k++;
        }

        while (i < a.length) {
            ans[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            ans[k] = b[j];
            j++;
            k++;
        }

        for (int index = 0; index < ans.length; index++) {
            System.out.print(ans[index] + " ");
        }
    }
}

