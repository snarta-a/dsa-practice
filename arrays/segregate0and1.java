public class segregate0and1 {

    public static void segregateZeroandOne(int[] arr) {

        int left = 0;             // start pointer
        int right = arr.length - 1;  //end pointer

        while (left < right) {

            if (arr[left] == 0) {
                left++;                   // 0 is in correct place 
            }
            else if (arr[right] == 1) {
                right--;                  // 1 is in correct place 
            }
            else {
                 
                //swap 1 and 0 

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        System.out.println("Before:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        segregateZeroandOne(arr);

        System.out.print("\nAfter: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}