import java.util.*;
class CountDistinctInteger{
    public static void main(String[] args){
        int[] nums={1,13,10,12,31};
        System.out.println(countDistinctIntegers(nums));
    }
    public static int countDistinctIntegers(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        int ind=0;
        for(int i=0;i<nums.length;i++){
            ans[ind++]=nums[i];
        }
        for(int num:nums){
            int sum=0;
            while(num>0){
                int mod=num%10;
                sum=sum*10+mod;
                num/=10;
            }
            ans[ind++]=sum;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int arr:ans){
            set.add(arr);
        }
        return set.size();
    }
}