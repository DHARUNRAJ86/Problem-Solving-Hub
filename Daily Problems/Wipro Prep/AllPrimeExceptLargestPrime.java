public class AllPrimeExceptLargestPrime {
    public static void main(String[] args) {
        int[] arr = {10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67};
        int n = 11;

        int ans = largestPrime(arr, n);
        System.out.println(ans);
    }

    public static int largestPrime(int[] arr, int n) {
        int sum = 0;
        int max = -1;
        boolean hasPrime = false;

        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                hasPrime = true;
                sum += arr[i];
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }

        if (hasPrime) {
            return sum - max;
        } else {
            int total = 0;
            int maxx = arr[0];

            for (int val : arr) {
                total += val;
                if (val > maxx) {
                    maxx = val;
                }
            }
            return total - maxx;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
