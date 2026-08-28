public class CountWords {
    public static void main(String[] args) {
        String s="a\\nyo\\t";
        System.out.println(countWords(s));
    }
    public static int countWords(String s) {
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ' || ch == '\t' || ch == '\n') {
                inWord = false;
            } else if (!inWord) {
                count++;
                inWord = true;
            }
        }
        return count;
    }
}
