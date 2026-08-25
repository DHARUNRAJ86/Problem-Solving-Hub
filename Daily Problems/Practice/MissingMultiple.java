import java.util.HashSet;

class MissingMultiple{
    public static void main(String[] args) {
        int[] nums={8,2,3,4,6};
        int k=2;
        System.out.println(missingMultiple(nums,k));
    }
    public static int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        
        boolean isTrue=true;
        int missing=k;
        while(isTrue){
            if(!set.contains(missing)){
                  return missing;
            }
            else{
                missing+=k;
            }
        }
        return -1;
    }
}