package Interview;
import java.util.Arrays;
import java.util.List;

public class Question3 {

	    public static void main(String[] args) {
	        // Define the main list and sub list
	        List<Integer> mainList = Arrays.asList(1, 2, 3, 4, 5);
	        List<Integer> subList = Arrays.asList(3, 4);

	        // Check if subList is part of mainList and print the result
	        System.out.println("Output: " + isSubList(mainList, subList));
	    }

	    // Method to check if subList is within mainList
	    public static String isSubList(List<Integer> mainList, List<Integer> subList) {
	        for (int i = 0; i <= mainList.size() - subList.size(); i++) {
	            if (mainList.subList(i, i + subList.size()).equals(subList)) {
	                return "true"; // Return "true" if subList is found
	            }
	        }
	        return "false"; // Return "false" if subList is not found
	    }
	}
