public class SumExceptFirstLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = sumExceptFirstLast(arr);
        System.out.println("Sum except first and last: " + sum);
    }

    public static int sumExceptFirstLast(int[] arr) {
        if (arr == null || arr.length <= 2) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
