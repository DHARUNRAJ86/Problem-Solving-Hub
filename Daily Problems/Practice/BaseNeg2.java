public class BaseNeg2 {
    public static void main(String[] args){
        int n=2;
        System.out.println(baseNeg2(n));
    }
    public static String baseNeg2(int n) {
        if(n==0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            int mod = n % -2;
            n/=-2;
            if(mod < 0){
                mod+=2;
                n++;
            }
            sb.append(mod);
        }
        return sb.reverse().toString();
    }
}
