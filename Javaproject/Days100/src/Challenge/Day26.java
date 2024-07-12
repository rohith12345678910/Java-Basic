package Challenge;

public class Day26 {
	public static void main(String[] args) {
        int[] a = {5, 6, 0, 9, 0, 8};
               
        int j = 0;
 
        for (int i = 0; i < a.length; i++) {    
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp; 
                j++;
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
