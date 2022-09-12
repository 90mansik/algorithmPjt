package algorithmPjt.test.nadongbin;

import java.util.Scanner;

public class P113 {

	/*
	 * 예제 4-2
	 * 시각
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count =0;
		
		for(int h=0; h<N+1; h++) {		// 시간

			for(int m=0; m<60; m++) {	// 분

				for(int s=0; s<60; s++) {	// 초
					String str = String.valueOf(h) + String.valueOf(m) + String.valueOf(s);
					if(str.contains("3")) {
						count++;
					}					
				}
				
			}
			
		}
		
		System.out.println(count);
	}
	
	
	

}
