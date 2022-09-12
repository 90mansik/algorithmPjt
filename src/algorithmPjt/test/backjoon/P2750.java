package algorithmPjt.test.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2750 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		
		int[] arr = new int[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr)); 
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {	
				if(arr[i]> arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
