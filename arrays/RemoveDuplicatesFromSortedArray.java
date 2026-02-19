public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int nums[] = {1, 1, 2};

        int newLength = removeDuplicates(nums);

        System.out.println("New length: " + newLength);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) 
        return 0;

        int count = 1;  // First element is always unique

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

}
pu
