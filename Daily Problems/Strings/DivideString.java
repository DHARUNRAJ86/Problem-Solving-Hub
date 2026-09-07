import java.util.*;
public class DivideString {
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        String[] res = divideString(s, k, fill);
        System.out.println(Arrays.toString(res));
    }
    public static String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i+=k){
            //String kk="";
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<i+k;j++){
                if(j<s.length()){
                    //kk+=s.charAt(j);
                    sb.append(s.charAt(j));
                }
                else{
                    //kk+=fill;
                    sb.append(fill);
                }
            }
            list.add(sb.toString());
        }
        String[] res = new String[list.size()];
        int ind=0;
        for(String num:list){
            res[ind++]=num;
        }
        return res;
    }
}
