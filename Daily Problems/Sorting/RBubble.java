import java.util.*;
public class RBubble {
    public static void main(String[] args){
        int[] arr={13,46,24,52,20,9};
        int[] ans =bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

