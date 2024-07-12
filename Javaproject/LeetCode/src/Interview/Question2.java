package Interview;
import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        Object[] a = {null, "java", null, "python", null, "c++"};
        List<Object> Null = new ArrayList<>();

        // Iterate through the array and collect non-null elements
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null) {
                Null.add(a[i]);
            }
        }

        // Print non-null elements in the desired format
        System.out.print("{");
        for (int i = 0; i < Null.size(); i++) {
            System.out.print(Null.get(i));
            if (i < Null.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}


