package algorithmPjt.test.backjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P11047 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] a1 = new Integer[n];
		
		for(int i=0; i<n; i++) {
			a1[i] = sc.nextInt();
		}
		
		
		System.out.println(findMinimum(n, k, a1)); 
	}
	
	
	public static int findMinimum(int n, int k, Integer[] a1 ) {
		System.out.println("findMinimum 시작");
		Arrays.sort( a1, Collections.reverseOrder() );
		
		int sum = 0;
		int cnt = 0;
		int i=0; 
		while(true) {
			if( a1[i] == k) {
				return ++cnt;
			}else if( a1[i] < k) {
				int temp =  sum+a1[i];
				if( temp == k) {
					cnt++;
					break;
				}else if( temp<= k) {
					sum=temp;
					cnt++;
				}else {
					i++;
				}
			}
			 	
			
		}
	
		return cnt;
		
	}
	
}
