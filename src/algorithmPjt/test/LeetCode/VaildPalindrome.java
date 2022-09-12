package algorithmPjt.test.LeetCode;

import java.util.ArrayList;

public class VaildPalindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a cancal: Panama";

        VaildPalindrome vp = new VaildPalindrome();

        //System.out.println( vp.isPalindrome(s) );
        //System.out.println(vp.isPalindrome1(s));
        //System.out.println(vp.isPalindrome2(s));
    }

    public boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");

        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }

        }
        return true;
    }
    
    
    public boolean isPalindrome1(String s){

    	ArrayList<String> list = new ArrayList<String>();

    	for(int i=0; i<s.length(); i++) {
    		if(Character.isLetter(s.charAt(i))) {
    			list.add(Character.toString(s.charAt(i)).toLowerCase());
    		}
    		
    	}
    	
    	String str = list.toString();
    	StringBuffer sb = new StringBuffer(list.toString());
    	String reversedStr = sb.reverse().toString();
    	
    	System.out.println(str);
    	System.out.println(reversedStr);
    	
    	for(int i=0; i<str.length(); i++) {
       		if(str.charAt(i) != reversedStr.charAt(i) ) {
    			System.out.println(str.charAt(i));
    			System.out.println(reversedStr.charAt(i));
    			return false;
    		}
    	}
    	
    	return true;
    	
    }
    
}
