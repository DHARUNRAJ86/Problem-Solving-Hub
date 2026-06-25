class SwapVowels{
    public static void main(String[] args){
        String s="thequickbrownfox";
    	String ans=swapVowels(s);
    	System.out.println(ans);
    }
    public static String swapVowels(String s) {
    	char c[]=s.toCharArray();
    	int left=0;
    	int right=c.length-1;
    	String vowel ="aeiou";
    	while(left<right) {
    		if(vowel.indexOf(c[left])==-1) {
    			left++;
    		}
    		else if(vowel.indexOf(c[right])==-1) {
    			right--;
    		}
    		else {
    			char temp =c[left];
    			c[left]=c[right];
    			c[right]=temp;
    			left++;
    			right--;
    		}
    	}
    	return new String(c);
  }
}