import java.util.ArrayList;
import java.util.Arrays;

class KLargest{
    public static void main(String[] args){
        int[] arr={12, 5, 787, 1, 23};
        int k=2;
        System.out.println(kLargest(arr, k));
    }

    public static ArrayList<Integer> kLargest(int[] arr, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(count==k){
                break;
            }
            else{
                list.add(arr[i]);
                count++;
            }
        }
        return list;
    }
}