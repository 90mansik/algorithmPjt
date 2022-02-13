package algorithmPjt.test.LeetCode;

public class SearchInsertPosition {

	// 배열
	// 배열에서 삽입 위치 찾기
	
	public static void main(String[] args) {
		
		SearchInsertPosition sip = new SearchInsertPosition();
		
		int[] nums1 = {1,3,5,6};
		int[] nums2 = {1};
		int target1 = 5;
		int target2 = 2;
		int target3 = 7;
		int target4 = 0;

		
		int result = sip.searchInsert(nums1, target1);
		int result2 = sip.searchInsert(nums1, target2);
		int result3 = sip.searchInsert(nums1, target3);
		int result4 = sip.searchInsert(nums2, target4);
		
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		
		
				
		
	}
	
	
	
	public int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length -1;
		
		while(low <= high) {
			
			int mid = low + (high - low)/2;
			
			if( target == nums[mid]) {		// 타켓이 중간값이랑 같을 경우
				return mid;
			}else if( target > nums[mid]) {	// 타켓이 중간값보다 클 경우
				low = mid+1;
			}else {	// 타켓이 중간값보다 작을 경우
				high = mid-1;
			}
		}
		
		return low;
	}
}
