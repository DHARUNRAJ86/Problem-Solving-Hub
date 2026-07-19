class CheckIfExists{
    public static void main(String[] args){
        int[] arr={10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==2*arr[j] || arr[j]==2*arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
}