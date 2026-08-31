import java.util.*;
public class SortVowels {
    public static void main(String[] args) {
        String s="lEetcOde";
        System.out.println(sortVowels(s));
    }
    public static String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        String vowel="aeiouAEIOU";
        for(char c:s.toCharArray()){
            if(vowel.indexOf(c)!=-1){
                list.add(c);
            }
        }
        Collections.sort(list);
        int i=0;
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(vowel.indexOf(c)==-1){
                sb.append(c);
            }
            else{
                sb.append(list.get(i++));
            }
        }
        return sb.toString();
    }
}
