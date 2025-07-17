import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true; // Duplicate found
            }
            set.add(nums[i]);
        }

        return false; // No duplicates found
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 4, 2};
        System.out.println("Contains duplicate: " + s.containsDuplicate(nums));
    }
}
