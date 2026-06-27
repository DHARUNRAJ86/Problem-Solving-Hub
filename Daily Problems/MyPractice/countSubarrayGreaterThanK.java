class countSubarrayGreaterThanK{
    public static void main(String[] args){
        int[] arr={2, 1, 3};
        int k=4;
        int ans=CountSubarrayGreaterThank(arr,k);
        System.out.println(ans);
    }
    public static int CountSubarrayGreaterThank(int[] arr,int k){
        int sum=0;
        int left=0;
        int count=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>=k){
                count+=(arr.length-right);
                sum-=arr[left];
                left++;
            }
        }
        return count;
    }
}