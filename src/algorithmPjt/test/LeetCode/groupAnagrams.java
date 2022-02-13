package algorithmPjt.test.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {

	
	public static void main(String[] args) {
		
		String[] strs =  {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupAnagrams(strs));
		
		//System.out.println(groupAnagrams2(strs)); 
		
	}
	
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<List<String>>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();   
        int k=0;
                
        for(int i=0; i<strs.length; i++) {
        	char[] charArr = strs[i].toCharArray();		// 정렬될 문자열
        	Arrays.sort(charArr);
        	String key = new String(charArr);
        	//해당 값이 키값  있으면
        	if( map.get(key) != null ){
        		int n= map.get(key);
        		List<String> set = list.get(n);
        		set.add(strs[i]);
        		list.set(n, set);
        	}else {
        		map.put(key, k++);
        		List<String> set = new ArrayList<String>();
        		set.add(strs[i]);
        		list.add(set);
        	}
        }
        
        return list;
    }
    
    public static List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> items = new ArrayList();
        int k = 0;
        for(int i=0; i<strs.length; i++){
            // key 생성하기.
            char[] strChars = strs[i].toCharArray();
            Arrays.sort(strChars);
            String key = new String(strChars);

            if(map.get(key) != null){
                int n = map.get(key);
                List<String> item = items.get(n);
                item.add(strs[i]);
                items.set(n, item);
            }else{
                map.put(key, k++);
                ArrayList<String> item = new ArrayList<>();
                item.add(strs[i]);
                items.add(item);
            }
        }
        return items;

    }   
}
