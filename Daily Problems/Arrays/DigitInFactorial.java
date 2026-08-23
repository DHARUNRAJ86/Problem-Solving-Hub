class DigitInFactorial{
    public static void main(String[] args) {
        int n=5;
        System.out.println(digitsInFactorial(n));
    }
    public static int digitsInFactorial(int n) {
        if (n <= 1)
            return 1;

        double digits = 0;

        for (int i = 2; i <= n; i++) {
            digits += Math.log10(i);
        }

        return (int) digits + 1;
    }
}