public class segregate0and1 {

    public static void segregateZeroandOne(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] == 0) {
                left++;
            }
            else if (arr[right] == 1) {
                right--;
            }
            else {

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