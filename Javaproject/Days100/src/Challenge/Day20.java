package Challenge;

import java.util.ArrayList;
import java.util.List;

public class Day20 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        int[] b = {2, 3, 5, 7};

        List<Integer> ans = new ArrayList<>();
        
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                ans.add(b[j]);
                i++;
                j++;
            }
        }

 
        System.out.println("Intersection of arrays a and b: " + ans);
    }
}
