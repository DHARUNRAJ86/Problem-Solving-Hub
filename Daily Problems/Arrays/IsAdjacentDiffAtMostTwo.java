class IsAdjacentDiffAtMostTwo{
    public static void main(String[] args) {
        String s="132";
        boolean res=isAdjacentDiffAtMostTwo(s);
        System.out.println(res);
    }
    public static boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1))>2){
                return false;
            }
        }
        return true;
    }
}