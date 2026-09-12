package Linkedlist;

public class FindtheDuplicateNumber {
    //Function to find duplicate number 
    static int findDuplicate(int [] nums) {

        //STEP 1 
        //Start Slow and Fast  from index 0

        int slow = 0;
        int fast = 0;

        // Find the meeting point 

        while(true) {
        
            //slow moves 1 step

            slow = nums[slow];

            //Fast moves 2 steps

            fast = nums[fast];
            fast = nums[fast];

        // if slow and fast meet

        if(slow == fast){
            //Step 2 
            //move Slow to back starting point 

            slow =0;
        //Now both move 1 step

        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }

        //Meeting point is the duplicate

        return slow;
    }
}
}
public static void main (String[] args) {

    //Example
    int [] nums = {1,3,4,2,2};

    //Find duplicate 
    int result = findDuplicate(nums);

    //Print answer
    System.out.println("Duplicate number :"+ result);
}
}

