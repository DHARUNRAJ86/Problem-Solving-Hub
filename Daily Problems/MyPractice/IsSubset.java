import java.util.HashMap;

class IsSubset{
    public static void main(String[] args){
        int[] a={11,7,1,13,21,3,7,3};
        int[] b={11,3,7,1,7};
        System.out.println(isSubset(a,b));
    }
    public static boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:b){
            if(!map.containsKey(num) || map.get(num)==0){
                return false;
            }
            map.put(num,map.getOrDefault(num,0)-1);
        }
        return true;
    }
}