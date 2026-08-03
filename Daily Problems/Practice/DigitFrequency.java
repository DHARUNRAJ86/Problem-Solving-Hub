import java.util.*;
public class DigitFrequency {
    public static void main(String[] args){
        int n=122;
        int ans =digitFrequencyScore(n);
        System.out.println(ans);
    }
    public static int digitFrequencyScore(int n){
        HashMap<Integer,Integer> map =new HashMap<>();
        while(n>0){
            int mod=n%10;
            map.put(mod,map.getOrDefault(mod,0)+1);
            n/=10;
        }
        int sum=0;
        for(int key:map.keySet()){
            sum+=key*map.get(key);
        }
        return sum;
    }
}
