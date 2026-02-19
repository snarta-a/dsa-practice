import java.util.Map;
import java.util.HashMap;

public class Subarray_sum_with_K {

    public static int subarray_sum_with_K(int[] nums, int k) {

        int sum = 0, result = 0;

        Map<Integer, Integer> presum = new HashMap<>();
        presum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (presum.containsKey(sum - k)) {
                result += presum.get(sum - k);
            }

            presum.put(sum, presum.getOrDefault(sum, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        int answer = subarray_sum_with_K(nums, k);

        System.out.println("Number of subarrays: " + answer);
    }
}
