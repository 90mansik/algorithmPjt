package algorithmPjt.test.backjoon;

import java.util.Scanner;

public class P2920 {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	
		int[] inputs = new int[8];
		String result = "mixed";
		
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i< inputs.length-1; i++) {
			int diff = inputs[i+1] - inputs[i];
			
			if( diff == 1) {
				result = "ascending";
			}else if( diff == -1) {
				result = "descending";
			}else {
				result = "mixed";
				break;
			}
		}
		
		System.out.println(result);
	}
	
	
	
	
	
}
