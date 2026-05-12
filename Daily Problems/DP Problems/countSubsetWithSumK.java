class countSubsetWithSumK{
    public static void main(String[] args){
        int[] nums = {1,2,2,3};
        int target =3;
        int ans = findWays(nums,target);
        System.out.println(ans);
    }
    public static int findWays(int[] nums,int tar){
        int n=nums.length;
        int[][] dp = new int[n][tar+1];
        for(int i=0;i<n;i++) dp[i][0]=1;
        if(nums[0]<=tar) dp[0][nums[0]]=1;
        for(int ind=1;ind<n;ind++){
            for(int sum=0;sum<tar;sum++){
                int notTake = dp[ind-1][tar];
                int take=0;
                if(nums[ind]<=sum) take=dp[ind-1][sum-nums[ind]];
                dp[ind][sum]=notTake+take;
            }
        }
        return dp[n-1][tar];
    }
}