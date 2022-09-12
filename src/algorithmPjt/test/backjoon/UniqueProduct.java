package algorithmPjt.test.backjoon;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class UniqueProduct {
	public static String firstUniqueProduct(String[] products) {
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap();
		
		int cnt = 0;
		for(int i=0; i<products.length; i++) {

			String target = products[i];
			if(map.containsKey(target)) {
				map.remove(target);
			}else {
				map.put(products[i], cnt++);
			}
		}
		
		Set<String> set =map.keySet();
		Iterator<String> iter = set.iterator();
		
		String result = (String)iter.next();
		        
		return result;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Computer","Apple",  "Apple", "Bag"  }));
    }
}
