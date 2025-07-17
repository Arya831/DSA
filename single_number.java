class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];  // XOR operation
        }
        return result;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Answer is: " + s.singleNumber(nums));
    }
}
