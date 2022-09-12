package algorithmPjt.test.nadongbin;

import java.util.Arrays;
import java.util.Scanner;

public class P312 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=-===========프로세스 시작============");
		String str = sc.next();
		System.out.println("str : " + str);
		char[] arr = str.toCharArray();
		int[] intArr = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			intArr[i] =Character.getNumericValue(arr[i]);
		}

		Arrays.sort(intArr);
		
		int result = 1;
		for(int i=intArr.length-1; i>=0; i--) {

			System.out.println(intArr[i]);
			if(intArr[i] == 0) {
				result += 0;
			}else if(intArr[i] == 1) {
				result += 1;
			}else {
				result = result * intArr[i];
			}
		}
		
		System.out.println("result : " + result);

	}
}
