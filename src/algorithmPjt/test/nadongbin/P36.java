package algorithmPjt.test.nadongbin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P36 {
	
	// 숫자 카드 게임
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		
		int[][] arr = new int[n][m];
		
		// 배열 받기
		for(int i=0; i<n; i++) {
			for( int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(sc.next()); 
			}
		}
		
		int[] arrMin = new int[arr.length];
		
		
		// 가장 작은 수 찾기
		for( int i=0; i<arr.length; i++) {
			int min = 10001;
			
			for(int j=0; j< arr[i].length; j++) {

				if(  arr[i][j] < min ) {
					min = arr[i][j];
				}
			}
			
			arrMin[i] = min;
		}
		
		// 가장 큰 수를 찾기 위한 정렬
		Arrays.sort(arrMin);
		
		//System.out.println(Arrays.deepToString(arr));
		//System.out.println(Arrays.toString(arrMin));
		System.out.println(arrMin[arrMin.length-1]);
		
		
		
	}
	
	
	public void Solution() throws Exception {
	    int N;
	    int[] explorer;
	    int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        explorer = new int[N];
        for (int i = 0; i < N; i++) {
            explorer[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(explorer);

        // 현재 그룹핑되는 그룹 인원 수
        int count = 0;
        for (int i = 0; i < N; i++) {
            count++;
            if (count >= explorer[i]) {
                answer++;
                count = 0;
            }
        }

        System.out.println(answer);
	}

}
