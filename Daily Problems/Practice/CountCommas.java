public class CountCommas {
    public static void main(String[] args){
        int n=1002;
        System.out.println(countCommas(n));
    }
    public static int countCommas(int n) {
        if(n<=3) return 0;
        int count=0;
        for(int i=1000;i<=n;i++){
            count++;
        }
        return count;
    }
}
