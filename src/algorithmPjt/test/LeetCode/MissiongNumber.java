package algorithmPjt.test.LeetCode;

import java.util.Arrays;

public class MissiongNumber {

	
	public static void main(String[] args) {
		
		
		int[] nums = {0,1};
		
		System.out.println( missingNumber(nums) ); 
	}
	
	
	// 가우스의 법칙을 이용하는 방법
	public static int missingNumber(int[] nums) {
	
		int len = nums.length;
		int sum = 0;
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		return ( len * (len +1 ) / 2 ) - sum;
		
		
		
		
	}
}
