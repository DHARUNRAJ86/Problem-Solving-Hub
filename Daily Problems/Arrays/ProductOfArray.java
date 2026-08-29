public class ProductOfArray {
    public static void main(String[] args) {
        long[] arr={1, 2, 3, 4};
        System.out.println(product(arr));
    }
    public static long product(long arr[]) {
        long product=1;
        for(long num:arr){
            product=(product*num) %1000000007;
        }
        return product;
    }
}
