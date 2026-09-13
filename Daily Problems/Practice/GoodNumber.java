public class GoodNumber {
    public static void main(String[] args){
        int n=1000;
        System.out.println(checkGoodInteger(n));
    }
    public static boolean checkGoodInteger(int n) {
        int len=String.valueOf(n).length();
        int[] arr=new int [len];
        int ind=0;
        while(n>0){
            int mod=n%10;
            arr[ind++]=mod;
            n/=10;
        }
        int digitSum=0;
        int squareSum=0;
        for(int num:arr){
            digitSum+=num;
            squareSum+=num*num;
        }
        return squareSum-digitSum>=50;
    }

}
