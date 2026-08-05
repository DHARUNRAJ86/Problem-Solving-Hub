class AlterDigitSum{
    public static void main(String[] args){
        int n=521;
        int ans =alternateDigitSum(n);
        System.out.println(ans);
    }
    public static int alternateDigitSum(int n){
        String s=Integer.toString(n);
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int num=Integer.parseInt(String.valueOf(s.charAt(i)));
            arr[i]=num;
        }
        int oddSum=0;
        int evenSum=0;
        for(int i=0;i<arr.length;i+=2){
            evenSum+=arr[i];
        }
        for(int i=1;i<arr.length;i+=2){
            oddSum+=arr[i];
        }
        return evenSum-oddSum;
    }
}