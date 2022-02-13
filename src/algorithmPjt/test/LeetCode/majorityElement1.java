package algorithmPjt.test.LeetCode;

import java.util.HashMap;

public class majorityElement1 {
	
	
	public static void main(String[] args) {
		
		majorityElement1 ma = new majorityElement1();
		
		int []  nums = {2,2,1,1,1,2,2};
		ma.majorityElement(nums);

	}
	
	
	public static int majorityElement(int[] nums) {
	
		int majorityCnt = nums.length/2;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++) {
			
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1 );
			}else {
				map.put(nums[i], 1);		
			}
			
			if(map.get(nums[i]) > majorityCnt) {
				return nums[i];
			}
		}
		return -1;
		
	}

}
