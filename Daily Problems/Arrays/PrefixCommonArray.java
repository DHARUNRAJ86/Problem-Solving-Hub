import java.util.Arrays;
public class PrefixCommonArray {
    public static void main(String[] args) {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        int[] result = prefixCommonArray(A, B);
        System.out.println(Arrays.toString(result));
    }
    public static int[] prefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        boolean[] seen = new boolean[51];
        int[] ans = new int[n];
        int common = 0;

        for (int i = 0; i < n; i++) {
            if (seen[A[i]]) {
                common++;
            } else {
                seen[A[i]] = true;
            }
            if (seen[B[i]]) {
                common++;
            } else {
                seen[B[i]] = true;
            }
            ans[i] = common;
        }

        return ans;
    }
}
