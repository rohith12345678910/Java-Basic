package Zoho;

public class Pattern7 {
	public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = row - i; j > 0; j--) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= i; k++) {
               
                    System.out.print("* ");
            }
            System.out.println();
            System.out.println();
            }
    }
}
