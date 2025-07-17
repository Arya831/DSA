class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = s.buildArray(nums);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
