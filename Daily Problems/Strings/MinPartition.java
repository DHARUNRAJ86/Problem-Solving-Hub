public class MinPartition {
    public static void main(String[] args) {
        String n="32";            //10 + 11 + 11 = 32
        System.out.println(minPartitions(n));
    }
    public static int minPartitions(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            ans = Math.max(ans, n.charAt(i) - '0');
        }
        return ans;
    }
}
