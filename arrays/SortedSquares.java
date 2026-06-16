import java.util.*;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {

        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        // Separate negative and positive numbers
        for (int num : nums) {
            if (num < 0)
                neg.add(num);
            else
                pos.add(num);
        }

        // Case 1: No negative numbers
        if (neg.size() == 0) {
            int[] ans = new int[pos.size()];

            for (int i = 0; i < pos.size(); i++) {
                ans[i] = pos.get(i) * pos.get(i);
            }

            return ans;
        }

        // Case 2: No positive numbers
        if (pos.size() == 0) {
            int[] ans = new int[neg.size()];

            for (int i = neg.size() - 1, j = 0; i >= 0; i--, j++) {
                ans[j] = neg.get(i) * neg.get(i);
            }

            return ans;
        }

        // Case 3: Both negative and positive exist

        int n1 = neg.size();
        int n2 = pos.size();

        int[] res = new int[n1 + n2];

        // Square negatives
        for (int i = 0; i < n1; i++) {
            neg.set(i, neg.get(i) * neg.get(i));
        }

        // Reverse negatives
        Collections.reverse(neg);

        // Square positives
        for (int i = 0; i < n2; i++) {
            pos.set(i, pos.get(i) * pos.get(i));
        }

        // Merge two sorted lists
        int i = 0;
        int j = 0;
        int id = 0;

        while (i < n1 && j < n2) {
            if (neg.get(i) <= pos.get(j)) {
                res[id++] = neg.get(i++);
            } else {
                res[id++] = pos.get(j++);
            }
        }

        while (i < n1) {
            res[id++] = neg.get(i++);
        }

        while (j < n2) {
            res[id++] = pos.get(j++);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {-7, -3, 2, 3, 11};

        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}