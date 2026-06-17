public class missingNumber {
    public static void main(String[] args){
        int[] nums={1,3,4,5};
        int ans =MissingNumber(nums);
        System.out.println(ans);
    }
    public static int MissingNumber(int[] nums){
        int n =nums.length+1;
        int totalSum =(n*(n+1))/2;
        int actualSum=0;
        for(int num:nums){
            actualSum+=num;
        }
        return totalSum-actualSum;
    }
}
