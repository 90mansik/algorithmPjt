package algorithmPjt.test.LeetCode;

import java.util.Arrays;

public class rotateArray {

	
	public static void main(String[] args) {
		rotateArray ra = new rotateArray();
		
		int nums[] = {1,2,3,4,5,6,7};
		int k=3;
		
		
		int nums2[] = {1,2,3,4,5,6,7};
		int k2=3;
		ra.rotate(nums, k);
	}
	
    public static void rotate(int[] nums, int k) {
        
    	int[] temp = new int[nums.length];
    	int shiftCnt = k%nums.length;
    	int tempCnt = shiftCnt;

    	for(int i=0; i<shiftCnt; i++) {
    		temp[i] = nums[temp.length-shiftCnt+i];
    	}
    	
    	for(int i=0; i<nums.length-shiftCnt; i++) {
    		temp[tempCnt++] = nums[i]; 
    	}

    	for(int i=0; i<nums.length; i++) {
    		nums[i] = temp[i];
    	}
    	System.out.println(Arrays.toString(nums)); 
    }

}
