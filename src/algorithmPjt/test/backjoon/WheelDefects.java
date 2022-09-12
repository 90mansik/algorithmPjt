package algorithmPjt.test.backjoon;

public class WheelDefects {
	  public static String simplify(String input) {
		    StringBuilder builder = new StringBuilder();
		    builder.append(input.charAt(0));

		    for (int i=1, len=input.length(); i<len; i++) {
		      if (input.charAt(i) != input.charAt(i-1)) {
		        builder.append(input.charAt(i));
		      }
		    }

		    return builder.toString();
		  }
    
    public static void main(String[] args) {
        System.out.println(WheelDefects.simplify("ghhrkkb"));        
    }
}
