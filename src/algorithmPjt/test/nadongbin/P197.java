package algorithmPjt.test.nadongbin;

import java.util.Arrays;
import java.util.Scanner;

public class P197 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start, mid, end  = 0;
		int N = sc.nextInt();
		
		int[] haveItems = new int[N];
		for(int i=0; i<N; i++) {
			haveItems[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] findItems = new int[M];
		
		for(int i=0; i<M; i++) {
			findItems[i] = sc.nextInt();
		}
		
		Arrays.sort(haveItems);
		
		int midx = 0;
		
		for(int i=0; i<findItems.length; i++) {
			String result = "no";
			start =0;
			end = haveItems.length-1;
			
			while(start <= end) {
			
				mid = (start + end ) / 2;
				
				if( haveItems[mid] == findItems[midx]) {						
					result = "yes";
					break;
				}else if ( haveItems[mid] > findItems[midx]) {		// 중간의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
					end = mid -1;
				}else {												// 중간의 값보다 찾고자 하는 값이 클 경우 오른쪽 확인
					start = mid + 1;
				}
				
			}
			midx++;
			System.out.println(result);
			
		}
		
		
		
		
		
		

		
		
	}
}
