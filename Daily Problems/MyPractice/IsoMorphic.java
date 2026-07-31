import java.util.HashMap;
class IsoMorphic{
    public static void main(String[] args){
        String s="add";
        String t ="egg";
        System.out.println(areIsomorphic(s,t));
    }
    public static boolean areIsomorphic(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> reverseMap = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }
            else{
                    map.put(ch1,ch2);
                }
                
            if(reverseMap.containsKey(ch2)){
                if(reverseMap.get(ch2)!=ch1){
                    return false;
                }
            }
            else{
                    reverseMap.put(ch2,ch1);
                }
        }
        return true;
    }
}