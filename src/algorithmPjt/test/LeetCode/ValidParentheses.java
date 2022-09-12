package algorithmPjt.test.LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	// 20.Valid Parentheses
	// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	// '(', ')', '{', '}', '[' 및 ']' 문자만 포함하는 문자열 s가 주어지면 입력 문자열이 유효한지 확인합니다.
	public static void main(String[] args) {
		
		String testCase1 = "()";
		String testCase2 = "()[]{}";
		String testCase3 = "(]";
		String testCase4 = "){";
		
	//	System.out.println(isValid(testCase1));
		System.out.println(isValid(testCase2));
	//	System.out.println(isValid(testCase3));
		System.out.println(isValid(testCase4));
		System.out.println(isValid("{"));
	}
	
	
	
	static public boolean isValid(String s) {
		
		Stack<String> stack = new Stack<>();
		String[] strArr = s.split("");
		HashMap<String, String> map = new HashMap<>();
		
		map.put(")", "(");
		map.put("}", "{");
		map.put("]", "[");
		
        if(strArr.length % 2 == 1) {
			return false;
		}
		
		for(String str : strArr) {
			if( !map.containsKey(str)) {
				stack.push(str);
			}else {
				if(stack.size() < 1) {
					return false;
				}
				
				if( stack.peek().equals(map.get(str) ) ) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		
		if(stack.size() > 0) {
			return false;
		}
		return true;
	}
}
