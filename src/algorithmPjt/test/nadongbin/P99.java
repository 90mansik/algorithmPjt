package algorithmPjt.test.nadongbin;

import java.util.Scanner;

public class P99 {

	/*
	 * 1이 될떄까지
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int count = 0;

		while ( n != 1) {
			if( n< k) {
				break;
			}
			if( n % k == 0 ) {
				n /= k;
				count++;
			}else {
				n -= 1;
				count++;
			}		
		}
		
		System.out.println(count);
	}
}
