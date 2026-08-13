class SumOfPrimeInRange{
    public static void main(String[] args){
        int n=13;
        System.out.println(sumOfPrimesInRange(n));
    }
     public static int sumOfPrimesInRange(int n) {
        int n1=n;
        int revSum=0;
        while(n>0){
            int mod=n%10;
            revSum=revSum*10+mod;
            n/=10;
        }
        int min=Math.min(n1,revSum);
        int max=Math.max(n1,revSum);
        int sum=0;
        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}