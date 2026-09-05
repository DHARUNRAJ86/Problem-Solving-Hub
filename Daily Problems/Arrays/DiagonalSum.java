public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int res = diagonalSum(mat);
        System.out.println(res);
    }
    public static int diagonalSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j || i+j==n-1){
                   sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
