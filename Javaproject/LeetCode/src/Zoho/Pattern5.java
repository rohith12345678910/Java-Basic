package Zoho;

public class Pattern5 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = row - i; j > 0; j--) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= i; k++) {
                if (i % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println();
            }
    }
}



