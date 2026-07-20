import java.util.Stack;

class RemoveStars{
    public static void main(String[] args){
        String s="leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String  removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='*'){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}