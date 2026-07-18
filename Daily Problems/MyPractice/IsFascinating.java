class IsFascinating{
    public static void main(String[] args){
        int n=192;
        System.out.println(isFascinating(n));
    }
    public static boolean isFascinating(int n) {
        int n1=2*n;
        int n2=3*n;
        String s=n+""+n1+""+n2;
        int[] freq = new int[10];
        for(char c:s.toCharArray()){
            freq[c-'0']++;
        }
        for(int i=1;i<10;i++){
            if(freq[i]!=1){
                return false;
            }
        }
        return true;
    }
}