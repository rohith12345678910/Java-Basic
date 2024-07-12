package Challenge;

public class Day3 {
    public static void main(String[] args) {
        int n = 2024; 

        if ((n % 4 == 0) && (n % 100 != 0)) {
            System.out.println("Leap Year");
        } else if (n % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Non-Leap Year");
        }
    }
}
