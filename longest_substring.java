class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String current = "";

        for (int i = 0; i < s.length(); i++) {
            String ch = String.valueOf(s.charAt(i));

            // If character already in substring, remove all before & including it
            if (current.contains(ch)) {
                current = current.substring(current.indexOf(ch) + 1);
            }

            current += ch;
            maxLength = Math.max(maxLength, current.length());
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcabcbb";
        System.out.println("Longest unique substring length: " + sol.lengthOfLongestSubstring(s));
    }
}
