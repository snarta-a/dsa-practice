import java.util.Scanner;

public class Segregate0sand1s {

    static void segregate(int[] arr) {

        // Left pointer
        int i = 0;                     

        // Right pointer
        int j = arr.length - 1;

        // Continue until pointers meet
        while (i < j) {

            // If left already has 0,
            // move left pointer
            if (arr[i] == 0) {
                i++;
            }

            // If right already has 1,
            // move right pointer
            else if (arr[j] == 1) {
                j--;
            }

            // arr[i] = 1 and arr[j] = 0
            // So swap them
            else {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Move both pointers
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter array size
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Enter array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function
        segregate(arr);

        // Print modified array
        System.out.print("[");

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i]);

            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        sc.close();
    }
}
