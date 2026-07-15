class CountEven{
    public static void main(String[] args){
        int n=4;
        int ans=countEven(n);
        System.out.println(ans);
    }
    public static int countEven(int n){
         int count=0;
        for(int i=1;i<=n;i++){
            if(check(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean check(int n){
        int sum=0;
        while(n>0){
            int mod=n%10;
            sum+=mod;
            n/=10;
        }
        return sum%2==0;
    }
}
