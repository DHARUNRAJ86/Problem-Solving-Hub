public class LCM {
    public static void main(String[] args){
        int a=5;
        int b=10;
        int ans=lcm(a,b);
        System.out.println(ans);
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
