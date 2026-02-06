// Day 1 – Two Sum
// Approach: HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // Map to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int required = target - nums[i];

            // If required number already exists, return answer
            if (map.containsKey(required)) {
                return new int[]{ map.get(required), i };
            }

            // Store current number with index
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
