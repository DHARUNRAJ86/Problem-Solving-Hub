class Main {
    public static void main(String[] args) {
        String s="abbccc";
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            int count=0;
            while(i<s.length() && s.charAt(i)==ch){
                count++;
                i++;
            }
            sb.append(ch).append(count);
        }
        System.out.println(sb.toString());
    }
}
