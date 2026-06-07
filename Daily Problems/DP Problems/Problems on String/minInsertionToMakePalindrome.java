class minInsertionToMakePalindrome{
    public static void main(String[] args){
        String s="abcaa";
        int ans=minInsertions(s);
        System.out.println(ans);
    }
    public static int minInsertions(String s) {
        int n=s.length();
        return n - longestPalindromicSubsequence(s);
    }
    public static int longestPalindromicSubsequence(String s){
        StringBuilder sb = new StringBuilder(s).reverse();
        String t=sb.toString();
        return lcs(s,t);
    }
    public static int lcs(String s,String t){
        int n=s.length();
        int m=t.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}