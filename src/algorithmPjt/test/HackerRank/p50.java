package algorithmPjt.test.HackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;

public class p50 {

	

	// https://www.hackerrank.com/contests/doyoulikeit/challenges/remove-duplicates-from-sorted-array
	// Remove Duplicates from Sorted Array(중복된 배열 제거)
	
	public static void main(String[] args) throws Exception{
		

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt) .sorted() .toArray(); 
		
        
        int curr = arr[0];
        int cnt = 1;
        
        for(int i=0; i<n; i++) {
            if(curr != arr[i]) {
                curr = arr[i];
                arr[cnt++] = arr[i];
            }
        }
        
        Arrays.toString(arr);
        System.out.println(cnt);
		
		
		

		
		
	}
	
	public void p50_1(int n, int[] arr ) {
		int curr = arr[0];
		int cnt = 1;
		
		for(int i=0; i<n; i++) {
			
			if(curr != arr[i]) {
				curr = arr[i];
				arr[cnt] = arr[i];
				cnt++;
			}
		}
		System.out.println("###########정답###########");
		System.out.println("cnt : " + cnt);
		System.out.println("array "+ Arrays.toString(arr));

	}
	
	public void p50_2(int n, int[] arr) {
		
		Hashtable<Integer, Integer> ht  = new Hashtable<Integer, Integer>();
		
		
		for(int i=0; i<n; i++) {
			//ht.put(i, value);
		}
		
	}
	
}
