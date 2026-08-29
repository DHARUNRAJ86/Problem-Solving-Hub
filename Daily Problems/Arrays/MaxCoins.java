import java.util.Arrays;

class MaxCoins{
    public static void main(String[] args) {
        int[] arr={2,4,1,2,7,8};
        System.out.println(maxCoins(arr));
    }
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int count = 0;

        for (int i = 0; i < piles.length / 3; i++) {
            count += piles[n - 2];
            n -= 2;
        }
        return count;

    }
}