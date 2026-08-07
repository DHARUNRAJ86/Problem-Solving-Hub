
public class CountDigitOccurance {
    public static void main(String[] args){
    int[] nums={12,54,32,22};
    int digit=2;
    System.out.println(countDigitOccurrences(nums,digit));
    }
    public static int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int num:nums){
            int temp=num;
            while(temp>0){
                int mod=temp%10;
                if(mod==digit){
                    count++;
                }
                temp/=10;
            }
        }
        return count;
    }
}
