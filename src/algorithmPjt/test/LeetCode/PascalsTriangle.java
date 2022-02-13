package algorithmPjt.test.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	
	public static void main(String[] args) {

		System.out.println(generate(5).toString());
	}
	
	
	public static List<List<Integer>> generate(int numRows) {
		
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
			
		for(int i=0; i<numRows; i++) {		// 받아온 numRows 만큼 List 생성
			ArrayList<Integer> row = new ArrayList<Integer>(i+1);

			if(i == 0 ) {	// 1번째 리스트 요소는 1로 초기화
				row.add(1);                 
			}else {			
				for(int j=0; j<=resList.size(); j++ ) {		// 등록된 ArrayList size만큼 ArrayList 값 셋팅
					ArrayList<Integer> before = (ArrayList<Integer>) resList.get(i-1); // 전 ArrayList 값 가져오기
					
					if(j == 0 || j == resList.size() ) {	// 행의 첫번째 값과 마지막 값은 1이다.
						row.add(1);
					}else {
						row.add(before.get(j-1) + before.get(j)); // 전 ArrayList의 자신의 위치-1, 위치 값을  가져와서 더해준다.
					}
				}
			}
			resList.add(row);
			
		}

		return resList;
	}
	
	// 
	public static List<List<Integer>> generate2(int numRows) {
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
		
		
		for(int i=0; i<=numRows; i++) {
			
		}
		
		return resList;
	}
	
	
	
}
