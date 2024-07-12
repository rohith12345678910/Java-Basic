package Zoho;

public class Program1 {
	
		    public static void main(String[] args) {
		        int[] nums = {6, 5, 4, 8};
		        int[] result = zoho(nums);

		        // Display the result
		        for (int num : result) {
		            System.out.print(num + " ");
		        }
		    }

		    public static int[] zoho(int[] nums) {
		        int[] temp = new int[101];

		        // Count occurrences of each element
		        for (int i = 0; i < nums.length; i++)
		            temp[nums[i]] += 1;

		        // Calculate cumulative sum
		        for (int j = 1; j <= 100; j++)
		            temp[j] += temp[j - 1];

		        // Update array based on cumulative sum
		        for (int k = 0; k < nums.length; k++) {
		            int pos = nums[k];
		            nums[k] = (pos == 0) ? 0 : temp[pos - 1];
		        }

		        return nums;
		    }
		}
		

		


