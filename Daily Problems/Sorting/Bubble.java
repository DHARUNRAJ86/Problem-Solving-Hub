import java.util.*;
class Bubble{
    public static void main(String[] args){
        int[] arr={5,3,4,8,10,2};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSorting(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}