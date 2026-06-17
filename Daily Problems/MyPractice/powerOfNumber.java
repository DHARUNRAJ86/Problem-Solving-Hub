class powerOfNumber{
    public static void main(String[] args){
        int n=2;
        int ans = reverseExponantation(n);
        System.out.println(ans);
    }
    public static int reverseExponantation(int n){
        int n1=n;
        int rev=0;
        while(n1>0){
            int mod=n1%10;
            rev=rev*10+mod;
            n1/=10;
        }
        return (int)Math.pow(n,rev);
    }
}