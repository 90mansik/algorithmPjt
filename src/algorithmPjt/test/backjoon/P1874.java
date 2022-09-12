package algorithmPjt.test.backjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class P1874 {

	
	
	// 1부터 n까지에 수에 대해 차례로 [push, push, push, push, pop, pop, push, push, pop, push, push, pop, pop, pop, pop, pop] 연산을 수행하면 수열 [4, 3, 6, 8, 7, 5, 2, 1]을 얻을 수 있다
	public static void main(String[] args) {
		///
		
		Stack<Integer> stack = new Stack<>();					// int 형 스택 선언
		ArrayList<String> array = new ArrayList<String>();		// +,- 담을 리스트
		
		Scanner sc = new Scanner(System.in);
		
	
		int n = sc.nextInt();
		int index = 0;
		
		int[] data = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
			
		}
			
		for( int i = 1; i<=n; i++) {
				

			stack.push(i);
			array.add("+");
			
			while(!stack.isEmpty()) {
				if( stack.peek() == data[index]) {
					stack.pop();
					array.add("-");
					index++;
				}else {
					break;
				}
			}

		}
		
		
		if( !stack.isEmpty() ) {
			System.out.println("NO");
		}else {
			for(String str : array) {
				System.out.println(str);
			}
		}
		
	}
	
	
}
