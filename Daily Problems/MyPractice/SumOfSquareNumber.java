public class SumOfSquareNumber {
    public static void main(String[] args){
        int c=5;
        boolean ans=sumOfSquare(c);
        System.out.println(ans);
    }
    public static boolean sumOfSquare(int c){
        int left=0;
        long right =(long)Math.sqrt(c);
        while(left<right){
            long sum=left*left+right*right;
            if(sum==c){
                return true;
            }
            else if(sum>c){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
}
