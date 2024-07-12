package Zoho;

import java.util.Scanner;

public class Interview2 {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        
        Scanner obj = new Scanner(System.in);
        
        int n = obj.nextInt();
        //System.out.println("The number is "+n);
      
        int result = climbingStair(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
    
    static int climbingStair(int n) {
        if (n <= 3) {
            return n;
        }
        int a = 3, b = 2;
        for (int i = 0; i < n - 3; i++) {
            
            a = a + b;
            b = a-b;
        }
        return a;
    }
}
