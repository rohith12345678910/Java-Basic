//Example 1:
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//Example 2:
//
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
 
package Coding;

public class ClimbingStairs {

	 public static void main(String[] args) {
	       System.out.println(climbingStair(5));
	    }
	    
	    static int climbingStair(int n) {
	    	if (n<=3)
	    	{
	    		return n;
	    	}
	    	
	    	int a=3,b=2;
	    	for (int i=0; i<n-3;i++) {
	    		a = a+b;
	    		b = a-b;
	    	}
	    	return a;
	    }
}
