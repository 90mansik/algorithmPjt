package algorithmPjt.test.nadongbin;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P32 {

	// 큰수의 법칙
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		System.out.println("n[" + n +"], m["+m+"], k["+k+"]");
		
		Integer[] arr = new Integer[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		//2, 4, 5, 4, 6
		//6, 5, 4, 4, 2

		int first = arr[0];
		int second = arr[1];
		int count =0;
		int result=0;
		
		for(int i=0; i<m; i++) {
			count++;
			
			if( k < count ) {
				result += second;
				count = 0;
			}else {
				result += first;
			}
		}			
		
		System.out.println(result);
	}
}
