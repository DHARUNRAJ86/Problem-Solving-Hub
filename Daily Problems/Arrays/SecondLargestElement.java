
public class SecondLargestElement {
    public static void main(String[] args){
        int[] nums={8, 8, 7, 6, 5};
        System.out.println(secondLargestElement(nums));
    }
    public static int secondLargestElement(int[] nums) {
          int max1=-1;
          int max2=-1;
          for(int num:nums){
            if(num>max1){
                max2=max1;
                max1=num;
            }
            else if(num>max2 && num!=max1){
                max2=num;
            }
          }
          return max2;
    }
}
