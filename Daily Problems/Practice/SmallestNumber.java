public class SmallestNumber {
    public static void main(String[] args){
        int n=10;
        int t=2;
        int ans =smallestNumber(n,t);
        System.out.println(ans);
    }
    public static int smallestNumber(int n,int t){
        while(true){
            int temp=n;
            int product=1;
            while(temp>0){
                int mod=temp%10;
                product*=mod;
                temp/=10;
            }
            if(product%t==0){
                return n;
            }
            n++;
        }
    }
}
