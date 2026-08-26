public class CountFactors {
    public static void main(String[] args) {
        int n=5;
        System.out.println(countFactors(n));
    }
    public static int countFactors(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
}
