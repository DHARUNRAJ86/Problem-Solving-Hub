class unboundKnapsack {
    public int unboundedKnapsack(int[] wt, int[] val, int n, int W) {
         int[][] dp = new int[n][W+1];
         for(int w=0;w<=W;w++){
            dp[0][w]=((int)(w/wt[0]))*val[0];
         }
         for(int ind=1;ind<n;ind++){
            for(int w=0;w<=W;w++){
                int notTake = dp[ind-1][w];
                int take=0;
                if(wt[ind]<=w){
                    take = val[ind]+dp[ind][w-wt[ind]];
                }
                dp[ind][w]=Math.max(take,notTake);
            }
         }
         return dp[n-1][W];
    }
}
