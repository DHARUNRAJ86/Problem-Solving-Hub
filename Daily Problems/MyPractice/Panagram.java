class Panagram{
    public static void main(String[] args){
        String s="Bawds jog, flick quartz, vex nymph";
        boolean ans=checkPanagram(s);
        System.out.println(ans);
    }
    public static boolean checkPanagram(String s) {
        s=s.replaceAll("[^a-zA-Z]","").toLowerCase();
        int[] freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                return false;
            }
        }
        return true;
    }
}