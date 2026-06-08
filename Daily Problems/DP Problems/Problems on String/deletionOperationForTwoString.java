class deletionOperationForTwoString{
    public static void main(String[] args){
        String s1="sea";
        String s2="eat";
        int ans =minDistance(s1,s2);
        System.out.println(ans);
    }
    public static int minDistance(String s1,String s2){
       return s1.length()+s2.length() - 2*lcs(s1,s2);
    }
    public static int lcs(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
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