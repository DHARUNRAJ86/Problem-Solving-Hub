import java.util.HashMap;

class PossibleToSplit{
    public static void main(String[] args){
        int[] nums={};
        System.out.println(isPossibleToSplit(nums));
    }
    public static boolean isPossibleToSplit(int[] nums){
         HashMap<Integer,Integer> map = new HashMap<>();
       for(int num:nums){
         map.put(num,map.getOrDefault(num,0)+1);
       }
       for(int key:map.keySet()){
        int freq =map.get(key);
        if(freq>2){
            return false;
        }
       }
       return true;
    }
}