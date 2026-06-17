import java.util.*;
public class reverseArray {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6};
        int[] ans=reverse(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] reverse(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int temp =nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;
    }
}
