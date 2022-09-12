package algorithmPjt.test.backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p3273 {
	

	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int target = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for(int i=0; i<n; i++) {
        	for(int j=i+1; j<n; j++) {
        		int sum = input[i]+input[j];

        		if( sum == target) {
        			cnt++;
        		}
        	}
        }
        
        System.out.println(cnt);
	}

	
	private void p3273_1() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(br.readLine()), cnt = 0;
        int start = 0;
        int end = n-1;
        
        while(start < end){
            int sum = input[start] + input[end];
            if(sum == target){
                end--; 
                start++;
                cnt++;
            }else if(sum>target) {
                end--;
            }else
                start++;
        }
        System.out.println(cnt);
	

	}
	public void p3273_2() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int target = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for(int i=0; i<n; i++) {
        	for(int j=i+1; j<n; j++) {
        		int sum = input[i]+input[j];

        		if( sum == target) {
        			cnt++;
        		}
        	}
        }
        
        System.out.println(cnt);
		
	}
	
	

}
