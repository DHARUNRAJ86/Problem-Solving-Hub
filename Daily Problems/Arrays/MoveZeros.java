import java.util.*;
class MoveZeros{
    public static void main(String[]args){
        int[] nums={0,1,0,3,12};
        int[] ans=moveZeroes(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] moveZeroes(int[] nums){
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ind]=nums[i];
                ind++;
            }
        }
        while(ind<nums.length){
            nums[ind++]=0;
        }
        return nums;
    }
}