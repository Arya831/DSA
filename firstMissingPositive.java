import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        for (int i = 1; i <= nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1; // shouldn't happen
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 4, -1, 1};
        System.out.println("First missing positive: " + s.firstMissingPositive(nums));
    }
}
