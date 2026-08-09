import java.util.*;
class ConcatArrayWReverse{
    public static void main(String[] args){
        int[] nums={1,2,3};
        int[] ans= concatWithReverse(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] concatWithReverse(int[] nums) {
         int n=nums.length;
        int[] arr = new int[2*n];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            arr[i+n]=nums[n-i-1];
        }
        return arr;
    }
}