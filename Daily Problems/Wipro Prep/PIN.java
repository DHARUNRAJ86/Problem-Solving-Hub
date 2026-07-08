import java.util.*;
public class PIN {
     public static void main(String[] args) {
        int input1 = 1274;
        int input2 = 5283;
        int input3 = 1937;

        int pin = generatePIN(input1, input2, input3);
        System.out.println("PIN = " + pin);
    }

    public static int generatePIN(int input1, int input2, int input3) {
        List<Integer> digits = new ArrayList<>();

        // Extract digits
        extractDigits(input1, digits);
        extractDigits(input2, digits);
        extractDigits(input3, digits);

        // Frequency array
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        // 1. Largest digit
        int maxDigit = 0;
        for (int d : digits) {
            if (d > maxDigit)
                maxDigit = d;
        }

        // 2. Smallest digit
        int minDigit = 9;
        for (int d : digits) {
            if (d < minDigit)
                minDigit = d;
        }

        // 3. Max frequency digit (if tie → largest)
        int maxFreq = 0;
        int maxFreqDigit = 0;
        for (int i = 0; i <= 9; i++) {
            if (freq[i] > maxFreq || (freq[i] == maxFreq && i > maxFreqDigit)) {
                maxFreq = freq[i];
                maxFreqDigit = i;
            }
        }

        // 4. Min frequency digit (ignore 0 freq, if tie → smallest)
        int minFreq = Integer.MAX_VALUE;
        int minFreqDigit = 9;
        for (int i = 0; i <= 9; i++) {
            if (freq[i] > 0 && (freq[i] < minFreq || (freq[i] == minFreq && i < minFreqDigit))) {
                minFreq = freq[i];
                minFreqDigit = i;
            }
        }

        // Form PIN
        int pin = maxDigit * 1000 + minDigit * 100 + maxFreqDigit * 10 + minFreqDigit;

        return pin;
    }

    public static void extractDigits(int num, List<Integer> digits) {
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
    }
}
