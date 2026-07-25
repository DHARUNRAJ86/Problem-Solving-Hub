package Leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] arr={"geeksforgeeks", "geeks", "geek", "geezer"};
        String ans=longestCommonPrefix(arr);
        System.out.println(ans);
    }
    public static String longestCommonPrefix(String[] arr){
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            while(!arr[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
