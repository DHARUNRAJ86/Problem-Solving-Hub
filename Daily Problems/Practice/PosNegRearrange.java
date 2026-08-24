import java.util.*;

public class PosNegRearrange {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9, 4, -2, -1, 5, 0, -5, -3, 2));
        rearrange(arr);
    }
    public static void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int num:arr){
            if(num>=0){
                positive.add(num);
            }
            else{
                negative.add(num);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i<positive.size() && j<negative.size()){
            res.add(positive.get(i++));
            res.add(negative.get(j++));
        }
        while(i<positive.size()){
            res.add(positive.get(i++));
        }
        while(j<negative.size()){
            res.add(negative.get(j++));
        }
        arr.clear();
        arr.addAll(res);
    }
}
