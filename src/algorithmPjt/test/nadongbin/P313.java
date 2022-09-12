package algorithmPjt.test.nadongbin;

import java.util.Scanner;

public class P313 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		String[] strArry = inputStr.split("");
		int cnt0 = 0;
		int cnt1 = 0;
		
		if(strArry[0].equals("0"))
			cnt0++;
		else
			cnt1++;
		
		for(int i = 0; i < strArry.length-1; i++) {
			if(!strArry[i].equals(strArry[i+1])) {
				if(strArry[i].equals("0")) {
					cnt0++;
				}else
					cnt1++;
			}
		}
		System.out.println(Math.min(cnt0, cnt1));	
		


		
	}
}
