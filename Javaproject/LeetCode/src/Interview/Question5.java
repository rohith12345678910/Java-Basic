package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question5 {
    public static void main(String[] args) {
        List<Map<String, Integer>> list = new ArrayList<>();

        // Add dictionaries to the list
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("c", 3);
        map2.put("d", 4);

        list.add(map1);
        list.add(map2);

        // Print key-value pairs
        for (int i = 0; i < list.size(); i++) {
            Map<String, Integer> map = list.get(i);
            for (String key : map.keySet()) {
                System.out.print(key + ":" + map.get(key) + "  ");
                System.out.println();
            }
        }
    }
}

