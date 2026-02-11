import java.util.Arrays;

public class RotateAnArray {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(rotate(nums, k)));
    }

    public static int[] rotate(int[] nums, int k) {

        int n = nums.length;  //rotate()

        k = k % n;   // Important step 
                    // k = 10  
                    //  n = 7
                    //10 % 7 = 3


            //Reverse full array.             
        reverse(nums, 0, n - 1);        //Before:  1 2 3 4 5 6 7   //After:   7 6 5 4 3 2 1
        reverse(nums, 0, k - 1);        //Reverse first k elements. 7 6 5 → becomes → 5 6 7  //Array becomes:5 6 7 4 3 2 1
        reverse(nums, k, n - 1);              //Reverse remaining elements. 4 3 2 1 → becomes → 1 2 3 4   Final :5 6 7 1 2 3 4
        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        //reverse() method
        while (start < end) {

            //Swap first and last.
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
