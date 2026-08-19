public class CommonDivisors {
    public static void main(String[] args){
       int a=12;
       int b=24;
       System.out.println(commDiv(a,b));
    }
    public static int commDiv(int a, int b) {
        int gcd = findGCD(a, b);
        int count = 0;
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
            }
        }
        return count;
    }
   public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

}
