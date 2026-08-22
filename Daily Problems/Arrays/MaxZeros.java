class MaxZeros{
    public static void main(String[] args) {
        int[][] arr={{0, 0, 0},{1, 0, 1},{0, 1, 1}};
        System.out.println(maxZeros(arr));
    }
    public static int maxZeros(int[][] arr) {
        int max=0;
        int ans=-1;
        for(int j=0;j<arr[0].length;j++){
            int count=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i][j]==0){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ans=j;
            }
        }
        return ans;
    }
}