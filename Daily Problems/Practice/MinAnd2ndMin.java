import java.util.ArrayList;
import java.util.TreeSet;
class MinAnd2ndMin{
    public static void main(String[] args) {
        int[] arr={2, 4, 3, 5, 6};
        ArrayList<Integer> ans =minAnd2ndMin(arr);
        System.out.println(ans);
    }
     public static ArrayList<Integer> minAnd2ndMin(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:arr){
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(set.size()==1){
            list.add(-1);
            return list;
        }
        int ind=0;
        for(int num:set){
            if(ind==2){
                break;
            }
            else{
                list.add(num);
                ind++;
            }
        }
        return list;
    }
}