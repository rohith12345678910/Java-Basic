//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]

package Coding;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
	
	public static void main(String[] args) {
	
		int[] nums = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums,13)));
	}
	
	public static int[] twoSum(int[] nums , int target) {
		
		HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>  ();
		
		for(int i=0; i<nums.length; i++) {
			
			int req = target - nums[i];
			
			if(hm.containsKey(req)) {
				int[] arr = {hm.get(req), i};
				return arr;
		}
			hm.put(nums[i], i);
	}
			return null;
}
}
