import java.util.ArrayList;
import java.util.HashSet;

public class uniqueSorted {
    public static void main(String[] args){
        int[] arr={3, 3, 2, 2, 1, 4};
        ArrayList<Integer> ans=UniqueSorted(arr);
        System.out.println(ans);
    }
    public static ArrayList<Integer> UniqueSorted(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        return new ArrayList<>(set);
    }
}
