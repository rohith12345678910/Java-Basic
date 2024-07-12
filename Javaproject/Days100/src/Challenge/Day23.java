package Challenge;

public class Day23 {

    public static void main(String[] args) {
        int num = 6; 

       
        for (int i = 1; i <= num; i++) {
            printStars(i);
        }

        
        for (int i = num - 1; i >= 1; i--) {
            printStars(i);
        }
    }
    
    private static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(); 
    }

}
