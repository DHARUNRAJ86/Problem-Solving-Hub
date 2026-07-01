import java.util.*;
class AlternativeSorting{
    public static void main(String[] args){
        int[] arr={7, 1, 2, 3, 4, 5, 6};
        List<Integer> ans =alternativeSorting(arr);
        System.out.println(ans);
    }
    public static List<Integer> alternativeSorting(int[] arr){
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(left==right){
                list.add(arr[left]);
                break;
            }
            else{
                list.add(arr[right--]);
                list.add(arr[left++]);
            }
        }
        return list;
    }
}