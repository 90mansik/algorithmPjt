package algorithmPjt.test.backjoon;

import java.util.Scanner;

public class P1427 {

	// url : https://www.acmicpc.net/problem/1427
	// 소트인사이드
	public static void main(String[] args) {
		

		P1427 p1427 = new P1427();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		String inputStr = Integer.toString(input);
		
		

		//System.out.println( p1427.selectionSort(inputStr) );
		System.out.println(p1427.bubleSort(inputStr));

		sc.close();
		// output == 4321;

	}
	
	public static String selectionSort(String inputStr) {

		char[] chArr = inputStr.toCharArray();	
		
		for(int i=0; i<chArr.length; i++) {		
			for(int j=i+1; j<chArr.length; j++) {
				if( Integer.parseInt(String.valueOf(chArr[i]))  < Integer.parseInt(String.valueOf(chArr[j]))) {
					char temp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = temp;		
				}
			}
		}

		String result = String.valueOf(chArr);
		
		
		return result;
	}
	
	public static String bubleSort(String inputStr) {
		
		char[] chArr = inputStr.toCharArray();
		
		for(int i=0; i<chArr.length; i++) {
			for(int j=0; j<(chArr.length-1)-i; j++) {
				
				if( Integer.parseInt(String.valueOf(chArr[j]))  < Integer.parseInt(String.valueOf(chArr[j+1]))) {
					char temp = chArr[j];
					chArr[j] = chArr[j+1];
					chArr[j+1] = temp;
				}   
			}
		}
		
		return String.valueOf(chArr);
	}
}
