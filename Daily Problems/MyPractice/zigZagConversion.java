public class zigZagConversion {
    public static void main(String[] args) {
    	String s = "PAYPALISHIRING";
    	int numRows = 3;
    	String ans =zigZag(s,numRows);
    	System.out.println(ans);
    	
     }
     public static String zigZag(String s,int numRows) {
    	if(numRows == 1 || s.length()<=numRows) {
    		return s;
    	}
    	StringBuilder[] sb = new StringBuilder[numRows];
    	for(int i=0;i<sb.length;i++) {
    		sb[i]=new StringBuilder();
    	}
    	int currows=0;
    	boolean goingDown = false;
    	for(char c:s.toCharArray()) {
    		sb[currows].append(c);
    		if(currows==0 || currows==numRows-1 ) {
    			goingDown=!goingDown;
    		}
    		currows+=goingDown?1:-1;
    	}
    	StringBuilder res = new StringBuilder();
    	for(StringBuilder s1 :sb) {
    		res.append(s1);
    	}
    	return res.toString();
     }
}
