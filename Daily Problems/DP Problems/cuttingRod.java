class cuttingRod{
    public static void main(String[] args){
        int[] prices={2,5,7,8,10};
        int n=5;
        System.out.println(cuttingRod(prices,n));
    }
    public static int cuttingRod(int[] prices,int n){
        int[][] dp = new int[n][n+1];
        for(int N=0;N<=n;N++){
            dp[0][N]=N*prices[0];
        }
        for(int ind=1;ind<n;ind++){
            for(int N=0;N<=n;N++){
                int notTake = 0+dp[ind-1][N];
                int take=Integer.MIN_VALUE;
                int rodlength=ind+1;
                if(rodlength<=N){
                    take=prices[ind]+dp[ind][N-rodlength];
                }
                dp[ind][N]=Math.max(notTake,take);
            }
        }
        return dp[n-1][n];
    }
}