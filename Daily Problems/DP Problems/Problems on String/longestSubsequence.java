class longestSubsequence{
    public static void main(String[] args) {
    	 String s1="abcde";
    	 String s2="ace";
    	 String ans =LongestSubsequence(s1,s2);
    	 System.out.println(ans);
     }
     public static String LongestSubsequence(String s1,String s2) {
    	 int n=s1.length();
    	 int m=s2.length();
    	 int[][] dp = new int[n+1][m+1];
    	 for(int i=1;i<=n;i++) {
    		 for(int j=1;j<=m;j++) {
    			 if(s1.charAt(i-1)==s2.charAt(j-1)) {
    				 dp[i][j]=1+dp[i-1][j-1];
    			 }
    			 else {
    				 dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
    			 }
    		 }
    	 }
    	 StringBuilder sb = new StringBuilder();
    	 int i=n,j=m;
    	 while(i>0 && j>0) {
    		 if(s1.charAt(i-1)==s2.charAt(j-1)) {
    			 sb.append(s1.charAt(i-1));
    			 i--;
    			 j--;
    		 }
    		 else if(dp[i-1][j]>dp[i][j-1]) {
    			 i--;
    		 }
    		 else {
    			 j--;
    		 }
    	 }
    	 return sb.reverse().toString();
     }
}