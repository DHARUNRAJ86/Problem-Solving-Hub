class SubsetXORSum{
    public static void main(String[] args) {
        int[] nums={1,3};
        System.out.println(subsetXORSum(nums));
    }
    public static int subsetXORSum(int[] nums) {
        int sumTotal = 0;
        for (int num : nums) {
            sumTotal =sumTotal| num;
        }
        return sumTotal << (nums.length - 1);
    }
}