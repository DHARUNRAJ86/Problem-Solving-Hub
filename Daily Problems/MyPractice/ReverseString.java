public class ReverseString {
    public static void main(String[] args){
        String s="dharun";
    	String ans=reverse(s);
    	System.out.println(ans);
    }
    public static String reverse(String s) {
    	char[] c=s.toCharArray();
    	int left=0;
    	int right=c.length-1;
    	while(left<=right) {
    		char temp =c[left];
    		c[left]=c[right];
    		c[right]=temp;
    		left++;
    		right--;
    	}
    	return new String(c);
    }
}
