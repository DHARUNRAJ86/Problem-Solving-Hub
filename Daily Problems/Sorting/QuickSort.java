//Quick Sort Algo
import java.util.*;
class QuickSort{
    public static void main(String[] args) {
        int[] arr={4,6,2,5,7,9,1,3};
        int n=arr.length-1;
        quickSort(arr,0,n);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
            
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}