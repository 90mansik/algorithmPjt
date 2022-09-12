package algorithmPjt.test.nadongbin;

import java.util.Arrays;
import java.util.Scanner;

public class P110 {

	
	/*
	 *  예제4-1) 상하좌우
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		sc.nextLine();
		
		String str = sc.nextLine();
		
		String[] strArr = str.split("\\s+");
			
		
		int row = 1;		// 행
		int column = 1;		// 열
		for(int i=0; i<strArr.length; i++) {
			
			if(strArr[i].equals("L")) {
				if( !(column-1 < 0) ) {
					column -= 1;
				}

			}else if(strArr[i].equals("R")) {
				if( !(column+1 > N) ) {
					column += 1;
				}

			}else if(strArr[i].equals("U")) {
				if( !(row-1 <= 0) ) {
					row -= 1;
				}
				
			}else if(strArr[i].equals("D")) {
				if( !(row+1 > N ) ) {
					row += 1;
				}

			}

		}
		
		
		System.out.println("(row, column) : "+row+","+column );
		
	}
}
