package Interview;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        List<List<Integer>> output = new ArrayList<>();
        output.add(list1);
        output.add(list2);

        System.out.println("Output: " + output);
    }
}
