public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        System.out.println(maxConsecutiveOnes(nums));
    }
    public  static int maxConsecutiveOnes(int[] nums) {
        int max1=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max1=Math.max(max1,count);
            }
            else{
                count=0;
            }
        }
        return max1;
        
    }
}
