public class WeightPattern {
    public static void main(String[] args) {
        int input1 = 1;
        int input2 = 5;
        int input3 = 2;

        int ans = WeightHill(input1, input2, input3);
        System.out.println(ans);
    }

    public static int WeightHill(int input1, int input2, int input3) {
        int sum = 0;
        int size = 1;

        for (int i = 1; i <= input1; i++) {
            int current = input2;

            for (int j = 1; j <= size; j++) {
                if (i == 1) {
                    sum += input2;
                } else {
                    if (j % 2 != 0) {
                        current += input3;
                        sum += current;
                    } else {
                        current -= input3;
                        sum += current;
                    }
                }
            }
            size += 2;
        }
        return sum;
    }
}
