import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "listen";
        String t = "silent";

        boolean result = sol.isAnagram(s, t);
        System.out.println("Is anagram: " + result);
    }
}
