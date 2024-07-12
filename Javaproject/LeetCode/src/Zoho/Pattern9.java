package Zoho;
public class Pattern9 {
    public static void main(String[] args) {
        int count = 1;
        int row = 5;
        for (int i = 1; i <= row; i++) {
        
            for (int k = row - i; k > 0; k--) {
                System.out.print("    "); 
            }
           
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-4d", count); 
                count++;
            }
            System.out.println(); 
        }
    }
}
