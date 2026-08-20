import java.util.*;
public class DistributeArray {
    public static void main(String[] args){
        int[] nums={2,1,3};
        int[] ans=resultArray(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int size1 = 1;
        int size2 = 1;
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (arr1[size1 - 1] > arr2[size2 - 1]) {
                arr1[size1++] = nums[i];
            } else {
                arr2[size2++] = nums[i];
            }
        }
        int[] result = new int[nums.length];
        int ind=0;
        for(int i=0;i<size1;i++){
            result[ind++]=arr1[i];
        }
        for(int i=0;i<size2;i++){
            result[ind++]=arr2[i];
        }
        
        return result;
    }
}
