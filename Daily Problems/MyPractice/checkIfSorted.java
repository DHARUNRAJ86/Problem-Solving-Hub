public class checkIfSorted {
    public static void main(String[] args){
        int[] arr= {1,2,3,4,6,5};
        boolean ans = ifSorted(arr);
        System.out.println(ans);
    }
    public static boolean ifSorted(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
