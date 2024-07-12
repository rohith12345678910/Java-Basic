package Interview;

public class Question1 {
	    public static void main(String[] args) {
	        int[] array = {3, 9, 1, 4, 7, 6};
	        int max = array[0]; // Assuming the first element is the maximum initially

	        // Loop through the array to find the maximum element
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }

	        System.out.println("The maximum number in the array is: " + max);
	    }
	}


