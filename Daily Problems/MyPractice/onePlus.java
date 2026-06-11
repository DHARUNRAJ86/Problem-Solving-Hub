import java.util.*;
public class onePlus {
    public static void main(String[] args){
        int[] num={999};
        int[] ans=OnePlus(num);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] OnePlus(int[] num){
        for(int i=num.length-1;i>=0;i--){
            if(num[i]<9){
                num[i]++;
                return num;
            }
            num[i]=0;
        }
        int[] res=new int[num.length+1];
        res[0]=1;
        return res;
    }
}
