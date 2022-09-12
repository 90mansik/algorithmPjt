package algorithmPjt.test.backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P5397 {

	
	public static void main(String[] args) throws Exception {
		
		// 입력 가능한 키는 알파벳 대문자, 소문자, 숫자, 백스페이스, 화살표
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1. 테스트 케이스 수를 받는다.
		int testcaseCnt = Integer.parseInt(br.readLine());

		for(int i=0; i<testcaseCnt; i++) {
			// 2. 패스워드 입력 받기
			char[] ch = br.readLine().toCharArray();
			
			Stack<Character> stack1 = new Stack<Character>();		// 리턴해줄 stack
			Stack<Character> stack2 = new Stack<Character>();		// 임시 저장 stack

			for(int j=0; j<ch.length; j++) {
				switch(ch[j]) {
				case '>':
					if( !stack2.isEmpty()) {	
						stack1.push(stack2.pop());
					}
					break;
				case '<' :				
					if( !stack1.isEmpty()) {
						stack2.push(stack1.pop());
					}
					
					break;
				case '-' :
					if(!stack1.isEmpty()) {
						stack1.pop();
					}
					break;

				default:
					stack1.push(ch[j]);
					
					break;
				}

			}
			
			while(!stack2.isEmpty() || stack2.size() != 0 ) {
				char temp = stack2.pop();
				stack1.push(temp);
			}
			
			StringBuffer sb = new StringBuffer();
			
			for(Character c : stack1) {
				sb.append(c);
			}
			System.out.println(sb);
			
		}
	}
}
