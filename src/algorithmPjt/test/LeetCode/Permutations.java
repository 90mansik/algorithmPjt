package algorithmPjt.test.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		
		Permutations pui = new Permutations();
		List<List<Integer>> result = new ArrayList<>();
		
		int[] nums = {1, 2, 3};

		pui.backtracking(result, nums, new ArrayList<Integer>());
		
		System.out.println(result.toString());

		
		
	}
	
    public void backtracking(List<List<Integer>> result, int[] nums, List<Integer> list) {
    	
    	System.out.println(list.size());
    	if( list.size() == nums.length) {
    		result.add(new ArrayList<>(list));
    		return;
    	}
    	
    	
    	for( int num : nums) {
    		if( !list.contains(num)) {
    			list.add(num);
    			backtracking(result, nums, list);
    			list.remove(list.size()-1);
    		}
    		
    	}
    	

    }
}
