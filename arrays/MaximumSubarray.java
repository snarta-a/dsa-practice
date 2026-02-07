public class MaximumSubarray {

    // Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];    //nums[0]

        for (int i = 0; i < nums.length; i++) {
            //i = 0 → nums[0] = -2
            sum = sum + nums[i];
            //sum = 0 + (-2) = -2

           

                if (sum > maxSum) {
                //-2 > -2 ❌ false
                maxSum = sum;
            }

            // if current sum becomes negative, reset it
            if (sum < 0) {
                //-2 < 0 ✅ true → sum = 0
                sum = 0;
            }
        }
        return maxSum;
    }

    //  main method to run in VS Code
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}
