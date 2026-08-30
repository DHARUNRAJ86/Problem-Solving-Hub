public class MinimumDeletion {
    public static void main(String[] args) {
        int[] arr={2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(arr));
    }
    public static int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minInd=0,maxInd=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minInd]) minInd=i;
            if(nums[i]>nums[maxInd]) maxInd=i;
        }
        int left=Math.min(minInd,maxInd);
        int right=Math.max(minInd,maxInd);
        //remove both from front
        int front=right+1;
        //remove both from back
        int back=n-left;
        //remove one from each side
        int frontBack=(left+1)+(n-right);

        return Math.min(front,Math.min(back,frontBack));
    }
}
