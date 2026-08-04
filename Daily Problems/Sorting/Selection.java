import java.util.*;
class Selection{
    public static void main(String[] args){
        int[] arr={13,46,24,52,20,9};
        int[] ans=selectionSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }
        return arr;
    }
}