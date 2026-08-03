class PrimeFactorization{
    public static void main(String[] args){
        int n=100;
        primeFactorization(n);
    }
    public static void primeFactorization(int n){
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
    }
}