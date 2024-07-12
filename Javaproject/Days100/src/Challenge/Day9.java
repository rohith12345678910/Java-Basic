package Challenge;
public class Day9 {
    public static void main(String[] args) {
        int a[] = {8, 7, 2, 8, 5, 4};
        int last = 4; // Last value to move to the start

        

      
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

       
        a[0] = last;

        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
