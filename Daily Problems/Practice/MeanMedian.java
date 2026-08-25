import java.util.Arrays;

public class MeanMedian {
    public static void main(String[] args) {
        int[] arr={1, 2, 19, 28, 5};
        System.out.println(mean(arr));
        System.out.println(median(arr));
    }
    public static int mean(int[] arr) {
        int len=arr.length;
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return (int)Math.floor(sum/len);
    }

    public static int median(int[] arr) {
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        int mid = low+(high-low)/2;
        if(arr.length%2==1){
            return arr[mid];
        }
        return (int)Math.floor((arr[mid]+arr[mid+1])/2);
    }
}
