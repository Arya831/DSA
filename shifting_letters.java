class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        long totalShift = 0;
        char[] result = new char[n];

        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            int shiftedCharIndex = (s.charAt(i) - 'a' + (int)totalShift) % 26;
            result[i] = (char) ('a' + shiftedCharIndex);
        }

        return new String(result);
    }
}
