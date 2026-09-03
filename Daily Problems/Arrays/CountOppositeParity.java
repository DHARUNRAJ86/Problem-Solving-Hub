import java.util.*;
public class CountOppositeParity {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] res=countOppositeParity(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int oddcount=0,evencount=0;
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--){
            if(nums[i]%2==0){
                evencount++;
                res[i]=oddcount;
            }
            else{
                oddcount++;
                res[i]=evencount;
            }
        }
        return res;
    }
}
