//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//Example 2:
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Example 3
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
package Coding;

public class PalindromeNumber {
		public static void main(String[] args) {
			System.out.println(isPalindrome(111));
		}
		
		static boolean isPalindrome(int z) {
			
			int x =0 , y = z  ,remainder;
			
			while(y>0) {
				remainder = y%10;
				x = x*10 + remainder;
				 y= y/10;
				
			}
			if (z==x) {
				return true;
			}
			else {
				return false;
			}
		}
}
