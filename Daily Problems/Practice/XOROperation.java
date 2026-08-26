public class XOROperation {
    public static void main(String[] args) {
        int n=5;
        int start=0;
        System.out.println(xorOperation(n,start));
    }
    public static int xorOperation(int n, int start) {
        int res = start;
        for (int i=1; i<n; i++){
            res = res ^ (start + 2 * i);
            }
        return res;
    }
}
