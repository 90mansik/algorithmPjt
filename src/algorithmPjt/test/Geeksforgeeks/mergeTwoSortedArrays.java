package algorithmPjt.test.Geeksforgeeks;

import java.util.Arrays;

public class mergeTwoSortedArrays {
	
	
	public static void main(String[] args) {
		
		//In put
		long arr1[] = {1,3,5,7};
		long arr2[] = {0,2,6,8,9};
		
		
		long arr3[] = {1,36,39,105,146,154,168,170,204,206,217,219,225,227,272,282,293,300,312,323,328,328,334,335,359,370,383,392,395,396,403,413,422,437,443,448,462,463,465,479,492,496};
		long arr4[] = {7,22,30,36,38,38,39,41,42,48,49,83,85,102,107,116,119,124,127,130,140,142,145,149,159,163,165,174,174,191,205,212,224,230,242,246,254,257,258,265,279,289,306,307,309,317,324,334,341,343,351,360,369,371,377,387,391,394,430,431,432,440,443,445,447,455,467,478};
		//merge(arr1, arr2, 4, 5);
		merge(arr3, arr4, 42,48);
	}

	
	public static void merge(long arr1[], long arr2[], int n, int m) {

		for(int i=0; i<n; i++) {
			long temp = arr1[i];		

			if(arr1[i] > arr2[0] ) { 	// arr1의 값이 arr2의 첫번째 값보다 크면
				arr1[i] = arr2[0];  		
				arr2[0] = temp;	 
				// arr2의 정렬을 위해 for문을 돌림.
				for(int j=1; j<m; j++) {		// arr2는 1번째 위치 부터 시작

					if( temp <= arr2[j]) {		// arr2[j]의 값이 위의 arr1[i]의 값보다 크거나 같으면
						arr2[j-1] = temp;		// arr1[i]의 값을 arr2[j-1]의 값으로 변경
						break;
					}			
					arr2[j-1] = arr2[j];		// 앞으로 한칸씩 이동
				}
			}

		}

		System.out.println( Arrays.toString(arr1).replace(",", ""));
		System.out.println( Arrays.toString(arr2).replace(",", "") );
	}
}
