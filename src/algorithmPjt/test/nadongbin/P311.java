package algorithmPjt.test.nadongbin;

import java.util.Arrays;
import java.util.Scanner;

public class P311 {

	// 모험가 길드
	public static void main(String[] args) {
		
		P311 p311 = new P311();
		
		p311.Solution();
//		Scanner sc = new Scanner(System.in);
//		int n = Integer.parseInt(sc.next());
//		int[] arr = new int[n];
//
//		int count = 0;
//		int temp = 0;
//
//		for(int i=0; i<n; i++) {
//			arr[i] = Integer.parseInt(sc.next());
//		}
//		
//		Arrays.sort(arr);
//		
//		System.out.println("n : " + n);
//		System.out.println("arr : " +  Arrays.toString(arr) );
//		
//		int t =arr.length;
//
//		for(int i=arr.length-1; i>=0; i--) {
//
//			temp = arr[i];  
//			t = t-temp;  
//
//			if( t >= 0 ) { 
//				count++;    
//				i = t -1;     
//			}else {
//				break;
//			}
//			
//		}
//		
//		System.out.println(count);
//		
		
	}
	
	
	public void Solution() {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] arr = new int[N];

		int groupCnt = 0;
        int count = 0;         // 현재 그룹핑되는 그룹 인원 수

		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            count++;
            if (count >= arr[i]) {
            	groupCnt++;
                count = 0;
            }
        }

        System.out.println(groupCnt);
	}
	
	

	
	
}
