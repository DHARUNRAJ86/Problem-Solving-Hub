import java.util.*;
class MaximumLengthSubstring{
    public static void main(String[] args){
        String s="bcbbbcba";
        System.out.println(maximumLengthSubstring(s));
    }
    public static int maximumLengthSubstring(String s) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String word=s.substring(i,j+1);
                if(check(word)){
                    max=Math.max(max,word.length());
                }
            }
        }
        return max;
    }
    public static boolean check(String word){
         HashMap<Character,Integer> map = new HashMap<>();
         for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)>2){
                return false;
            }
         }
         return true;

    }
}