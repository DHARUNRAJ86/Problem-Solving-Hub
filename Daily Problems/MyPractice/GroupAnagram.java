import java.util.*;
class GroupAnagram{
    public static void main(String[] args){
        String[] s={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagram(s));
    }
    public static List<List<String>> groupAnagram(String[] s){
          HashMap<String,List<String>> map = new HashMap<>();
          for(String word:s){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
          }
          return new ArrayList<>(map.values());
    }
}