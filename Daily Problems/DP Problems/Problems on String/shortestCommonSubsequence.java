public class shortestCommonSubsequence {
    public static void main(String[] args){
        String s1="abac";
        String s2="cab";
        String ans= ShortestCommonSupersequence(s1,s2);
        System.out.println(ans);
    }
    public static String ShortestCommonSupersequence(String str1, String str2) {
       int n=str1.length();
       int m=str2.length();
       int[][] dp = new int[n+1][m+1];
       for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
            }
            else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
       } 
       String ans="";
       int i=n,j=m;
       while(i>0 && j>0){
        if(str1.charAt(i-1)==str2.charAt(j-1)){
            ans+=str1.charAt(i-1);
            i--;
            j--;
        }
        else if(dp[i-1][j]>dp[i][j-1]){
            ans+=str1.charAt(i-1);
            i--;
        }
        else{
            ans+=str2.charAt(j-1);
            j--;
        }
       }
       while(i>0) {
        ans+=str1.charAt(i-1);
        i--;
       }
       while(j>0){
        ans+=str2.charAt(j-1);
        j--;
       }
       return reverse(ans);
    }
    public static String reverse(String ans){
        StringBuilder sb = new StringBuilder();
        for(int i=ans.length()-1;i>=0;i--){
            char c=ans.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }
}
