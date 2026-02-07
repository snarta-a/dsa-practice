// Day 1 – Two Sum
// Approach: HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)                                       
                                                               /*  approach
                                                                1 2 3
                                                                5

                                                                1 -> 5 - 1 = 4 ? No
                                                                map -> 1

                                                                2 -> 5 - 2 = 3 ? No
                                                                map -> 1, 2

                                                                3 -> 5 - 3 = 2 ? Yes

                                                                arr[0] = i;
                                                                arr[1] = value;
 */
import  java.util.HashMap;
public class TwoSum {
public static int[] twoSum(int[] nums, int target) {
        // hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        // define an array
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(target - nums[i]);
            if (value == null) {
                map.put(nums[i], i);
            }
            else{
                arr[0]=i;
                arr[1]=value;}
        }
        return arr;
    }

//  MAIN METHOD (only for running/testing)
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + ", " + result[1]);
    }
}




/* Approach: Brute Force
 Time Complexity: O(n^2)  
 Space Complexity: O(1)
 public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        int[] arr = new int[2];
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        
        }
        return arr;
    }
}  */