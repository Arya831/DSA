import java.util.*;

public class Solution {
    public int maxSumDivThree(int[] nums) {
        int total = 0;
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        for (int num : nums) {
            total += num;
            if (num % 3 == 1) r1.add(num);
            else if (num % 3 == 2) r2.add(num);
        }

        Collections.sort(r1);
        Collections.sort(r2);

        if (total % 3 == 0) return total;

        if (total % 3 == 1) {
            int removeOne = r1.size() > 0 ? total - r1.get(0) : 0;
            int removeTwo = r2.size() > 1 ? total - r2.get(0) - r2.get(1) : 0;
            return Math.max(removeOne, removeTwo);
        } else {
            int removeOne = r2.size() > 0 ? total - r2.get(0) : 0;
            int removeTwo = r1.size() > 1 ? total - r1.get(0) - r1.get(1) : 0;
            return Math.max(removeOne, removeTwo);
        }
    }
}

