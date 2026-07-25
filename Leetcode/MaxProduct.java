package Leetcode;

public class MaxProduct {
    public static void main(String[] args){
        int n=437;
        System.out.println(maxProduct(n));
    }
    public static int maxProduct(int n) {
        int len =String.valueOf(n).length();
    	   int[] arr= new int[len];
    	   int ind=0;
    	   while(n>0) {
    		   int mod=n%10;
    		   arr[ind++]=mod;
    		   n/=10;
    	   }
    	   int max=-1;
    	   for(int i=0;i<arr.length-1;i++) {
    		   int product=1;
    		   for(int j=i+1;j<arr.length;j++) {
    			   product=arr[i]*arr[j];
                   max=Math.max(product,max);
                   product=1;
    		   }
    		   
    		   
    	   }
    	   return max;
    }
}
