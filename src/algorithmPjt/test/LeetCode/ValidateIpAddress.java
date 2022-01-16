package algorithmPjt.test.LeetCode;

public class ValidateIpAddress {

	public static void main(String[] args) {
		String tt = "rxwr-x-w-";
		int j=0;
		int total=0;
		for(int i=0; i<tt.length();i++) {
		
			char ch = tt.charAt(i);
		
			if(ch == 'r') {
				total += 4;
			}else if(ch == 'w') {
				total += 2;
			}else if(ch == 'x') {
				total += 1;
			}
			
			

		}

		System.out.println(total);
	}

}
