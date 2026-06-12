import java.util.HashMap;

public class subarraySumEqualtoK {
    public static void main(String[] args) {
    	int[] num = {1,1,1};
    	int k=2;
    	int ans=subarraySum(num,k);
    	System.out.println(ans);
    }
    public static int subarraySum(int[] nums,int k) {
    	HashMap<Integer,Integer> map = new HashMap<>();
    	// base case(sum,count)
    	map.put(0,1);
    	int sum=0;
    	int count=0;
    	for(int num:nums) {
    		sum+=num;
    		if(map.containsKey(sum-k)) {
    			count+=map.get(sum-k);
    		}
    		map.put(sum,map.getOrDefault(sum,0)+1);
    	}
    	return count;
    }
}
