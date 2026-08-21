public class MinEle {
    public static void main(String[] args) {
        int[][] arr={{1, 1, 1, 1},{1, 1, 0, 0},{0, 0, 1, 1},{1, 1, 1, 1}};
        System.out.println(minRow(arr));
    }
    public static int minRow(int mat[][]) {
        int min=Integer.MAX_VALUE;
        int n=mat.length;
        int m=mat[0].length;
        int ans=Integer.MAX_VALUE;  
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count<min){
                min=count;
                ans=i+1;
            }
        }
        return ans;
    }
}
