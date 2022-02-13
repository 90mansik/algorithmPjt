package algorithmPjt.test.LeetCode;

public class ClimbStairs {
	
	// 70.Climbing Stairs
	// URL : https://leetcode.com/problems/climbing-stairs/
	// You are climbing a staircase. It takes n steps to reach the top.
	// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	

	public static void main(String[] args) {
		System.out.println( climbStairs(3));
	}
	
    static public int climbStairs(int n) {
        return climb_stairs(0, n);
    }
	    
	static public int climb_stairs(int i, int n){        
	        if(i > n){
	          return 0;
	        }
	        if(n == i){
	            return 1;
	        }
	        
	        return climb_stairs(i+1, n) + climb_stairs(i+2, n);
	}
}

	// dp
	/*
	static public int climbStairs(int n) {
	
		if( n< 2) {
			return n;
		}
		
		
	    int [] answer = new int[n];
	    answer[0] = 1;
	    answer[1] = 2;
	
	    for (int i = 2; i < n ; i++) {
	    	answer[i] = answer[i-2] + answer[i-1];
	    }

        return answer[n-1];
	}
	*/
	
	
