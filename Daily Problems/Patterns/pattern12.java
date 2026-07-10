class pattern12{
    public static void main(String[] args){
        int n=4;
        int start=1;
        for(int i=0;i<n;i++){
            int ans=start;
            for(int j=0;j<=i;j++){
                System.out.print(ans+" ");
                ans++;
            }
            System.out.println();
            start=ans-1;
        }
    }
}