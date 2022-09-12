package algorithmPjt.test.nadongbin;

import java.util.Scanner;

public class P115 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		// 나이트 이동 가능 경로
		int[][] POSSIBLE_MOVE = {{1,2}, {-1,2}, {1,-2}, {-1,-2}, {2,1}, {2,-1}, {-2,1}, {-2,-1}};
		int possibleCnt = 0;
	
		char[] InCharArray = sc.next().toCharArray();		// 키보드로 입력 받은 문자열 char형 Array로 변경
		int row = InCharArray[0]-'a';						// 입력받는 a~h를 배열의 인덱스로 변경
		int column = InCharArray[1]-'1';					// 입력받은 숫자 0부터 시작하게 변경
		
		for(int i=0; i<POSSIBLE_MOVE.length; i++) {
			
			int row_sum = row+POSSIBLE_MOVE[i][0];
			int column_sum = column+POSSIBLE_MOVE[i][1];
			if(row_sum > -1 && row_sum < 8 &&  column_sum > -1 && column_sum < 8 ) {
				possibleCnt++;
			}
			
		}
		
		System.out.println("possibleCnt : " + possibleCnt);

		
		
		
		
		
	}

}
