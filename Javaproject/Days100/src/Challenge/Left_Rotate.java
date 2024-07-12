package Challenge;

public class Left_Rotate {
	 public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4, 5};
	        int last = a[0]; // Store the first element to move it to the end after shifting

	        // Shift elements to the left
	        for (int i = 0; i < a.length - 1; i++) {
	            a[i] = a[i + 1];
	        }

	        // Set the last element to the former first element
	        a[a.length - 1] = last;

	        // Print the array using a traditional for loop
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }

}
