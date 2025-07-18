class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // if digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // else set current digit to 0 and continue
            digits[i] = 0;
        }

        // if all digits were 9, we need one more digit
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; // e.g. [9,9,9] -> [1,0,0,0]
        return newNumber;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] digits = {9, 9, 9};
        int[] result = s.plusOne(digits);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
