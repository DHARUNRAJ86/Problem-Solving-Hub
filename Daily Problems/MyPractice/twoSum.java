import java.util.*;
class TwoSum{
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
    	int target=13;
    	int[] ans =twoSum(nums,target);
    	System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums,int target) {
    	HashMap<Integer,Integer> map = new HashMap<>();
    	for(int i=0;i<nums.length;i++) {
    		int value=target-nums[i];
    		if(map.containsKey(value)) {
    			return new int[] {map.get(value),i};
    		}
    		map.put(nums[i],i);
    	}
    	return new int[] {-1,-1};
    }
}