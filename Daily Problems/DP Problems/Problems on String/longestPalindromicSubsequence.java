public class longestPalindromicSubsequence {
    public static void main(String[] args){
        String s="bbbab";
        int ans=longestPalindromeSubseq(s);
        System.out.println(ans);
    }
    public static int longestPalindromeSubseq(String s) {
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
