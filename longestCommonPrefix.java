class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String prefix = strs[0];  // Assume the first string as prefix

        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the current string
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix is: " + s.longestCommonPrefix(strs));
    }
}
