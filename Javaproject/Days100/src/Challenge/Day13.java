package Challenge;
import java.util.ArrayList;
import java.util.List;

public class Day13 {
    public static void main(String[] args) {
        int a[] = {16, 17, 4, 3, 5, 2};
        List<Integer> ans = new ArrayList<>();
        int max = a[a.length - 1]; 
        ans.add(max); 

        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > max) {
                ans.add(a[i]); 
                max = a[i];
            }
        }

        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
    }
}

