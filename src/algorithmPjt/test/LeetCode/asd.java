package algorithmPjt.test.LeetCode;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class asd {

    public static String simplify(String input) {

    	/*
    	ArrayList<Character> str = new ArrayList<Character>();
    	
    	for(int i=0; i<input.length(); i++) {
    		
    		if(i>0) {
    			if(input.charAt(i) != input.charAt(i-1)) {
    				str.add(input.charAt(i));
    			}
    		}else {
    			str.add(input.charAt(i));
    		}
    	}
    	
    	
    	System.out.println(str.toString());
    	return "";
    	*/
    	
    	String[] strArr= input.split("");
    	LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(strArr));

    	String[] resultArr = linkedHashSet.toArray(new String[0]);
    	String result = Arrays.toString(resultArr);
    	
    	result = result.replaceAll(",", "");
    	result = result.replace(" ", "");
    	result = result.replaceAll("]", "");
    	result = result.replace("[", "");
    	
    	return result;
    }
    
    public static void main(String[] args) {
        System.out.println(asd.simplify("ghhrkkb"));        
    }
}
