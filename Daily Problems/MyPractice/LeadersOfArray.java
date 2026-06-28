import java.util.*;
class LeaderOfArray{
    public static void main(String[] args){
        int[] arr= {};
    	int[] ans =leadersOfArray(arr);
    	System.out.println(Arrays.toString(ans));
    }
    public static int[] leadersOfArray(int[] arr) {
    	if(arr.length==1) return arr;
    	List<Integer> list = new ArrayList<>();
    	int max=arr[arr.length-1];
    	list.add(max);
    	for(int i=arr.length-2;i>=0;i--) {
    		if(arr[i]>=max) {
    			max=arr[i];
    			list.add(arr[i]);
    		}
    	}
    	Collections.reverse(list);
    	int[] ans = new int[list.size()];
    	int ind=0;
    	for(int num:list) {
    		ans[ind++]=num;
    	}
    	return ans;
    }
}