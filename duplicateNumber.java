class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return nums[i]; // Found the duplicate
                }
            }
        }
        return -1; // No duplicate found (edge case)
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number is: " + s.findDuplicate(nums));
    }
}
