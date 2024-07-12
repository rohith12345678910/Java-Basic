package Challenge;

public class Day17 {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 2, 2};
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            x = x + a[i];
        }
        for (int i = 0; i < a.length; i++) {
            x = x - a[i];
            if (x == y) {
                System.out.println("Equilibrium index found at index " + (a[i]));
                return; 
            }
            y = y + a[i];
        }
        System.out.println("No equilibrium index found");
    }
}

