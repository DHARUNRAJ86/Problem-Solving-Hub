import java.util.*;
class MPrimeDifference{
    public static void main(String[] args){
        int[] nums={4,2,9,5,3};
        System.out.println(maximumPrimeDifference(nums));
    }
    public static int maximumPrimeDifference(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])){
                list.add(i);
            }
        }
        return Math.abs(list.get(0)-list.get(list.size()-1));
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}