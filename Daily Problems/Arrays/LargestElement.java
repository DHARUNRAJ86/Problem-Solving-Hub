public class LargestElement {
    public static void main(String[] args){
        int[] nums={3, 3, 6, 1};
        System.out.println(largestElement(nums));
    }
    public static int largestElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        return max;
    }

}
