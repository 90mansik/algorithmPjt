package algorithmPjt.test.LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

	
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3, n =3;
		
		MergeSortedArray msa = new MergeSortedArray();
		
		msa.merge(nums1, m, nums2, n);
		
	}
	
	
	
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        
		int i=m-1; 
		int j=n-1;
		int k= m+n-1;
		
		while(i>=0 && j>=0) {
			
			if( nums1[i] < nums2[j] ) {		// num1배열 값이 num2배열 값보다 큰 경우
				nums1[k] = nums2[j];
				j -=1 ;
			}else {							// num1배열값이 num2배열보다 작거나 같은 경우
				nums1[k] = nums1[i];
				i -=1;
			}
			
			k-=1;
			
		}
		
		System.out.println("nums1:"+ Arrays.toString(nums1) );
		System.out.println("j: " + j);
		while(j>=0) {
			nums1[j] = nums2[j];
			j--;
		}
		
		
		System.out.println("nums1:"+ Arrays.toString(nums1) );
		
    }
}
