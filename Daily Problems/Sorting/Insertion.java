import java.util.*;
class Insertion{
    public static void main(String[] args){
        int[] arr={14,9,15,12,6,8,13};
        int[] ans=insertionSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] insertionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
        return arr;
    }
    public static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}