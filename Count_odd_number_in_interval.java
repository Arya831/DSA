class Solution {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;
        if (low % 2 != 0 || high % 2 != 0) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int low = 3, high = 7;
        System.out.println("Number of odd numbers: " + sol.countOdds(low, high));
    }
}
