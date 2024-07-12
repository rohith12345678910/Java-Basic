package Challenge;
import java.util.HashSet;
import java.util.Set;

public class Day28 {
    public static void main(String[] args) {
        int[] values = {2, 3, 5, 6, 7, 9, 1, 2, 3};
        Set<Integer> a = new HashSet<>();
        
        for (int i = 0; i < values.length; i++) {
            a.add(values[i]); 
        }
        
        System.out.println("Set a: " + a);
    }
}
