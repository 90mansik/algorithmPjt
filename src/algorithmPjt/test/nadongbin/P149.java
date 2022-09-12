package algorithmPjt.test.nadongbin;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class P149 {
	
	
	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());		// 헹
		int M = Integer.parseInt(sc.next());		// 열
			
		for(int i=0; i<N; i++) {
			ArrayList<Integer> graphInput = new ArrayList<>();
			for(int j=0; j<M; j++) {
				String str = sc.nextLine();

				int[] digits = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
				
				for(int k=0; k<digits.length; k++) {
					graphInput.add(1);
				}				
			}
		}
			

		
	}

}
