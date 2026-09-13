package TwoPointer;

import java.util.Scanner;

public class PairwirhTargetSum {

    // Two pointer function
    static int[] twoSum(int[] nums, int target) {

        // Left pointer
        int i = 0;

        // Right pointer
        int j = nums.length - 1;

        // Continue until pointers meet
        while (i < j) {

            // Find the sum
            int sum = nums[i] + nums[j];

            // Sum is equal to target
            if (sum == target) {

                // +1 because LeetCode uses 1-based index
                return new int[]{i + 1, j + 1};
            }

            // Sum is smaller than target
            else if (sum < target) {

                // Move left pointer
                i++;
            }

            // Sum is greater than target
            else {

                // Move right pointer
                j--;
            }
        }

        // No answer
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter array size
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Enter array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Enter target
        int target = sc.nextInt();

        // Call twoSum
        int[] result = twoSum(nums, target);

        // Print result
        System.out.println("[" + result[0] + ", " + result[1] + "]");

        sc.close();
    }
}
