
/*Ques6. The problem to rearrange positive and negative 32
numbers in an array
Method: This approach moves all negative numbers to
the beginning and positive numbers to the end but
changes the order of appearance of the elements of
the array.
Input:   1 -1 2 -2 3 -3
Output: -1 -2 -3 1 3 2 */
import java.util.*;

public class RearrangeArray6 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = input.nextInt();

        int arr[] = new int[n];
        System.out.print("Input the array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Original array : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }

        int j = 0, temp; // order not maintained
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j++;
            }
        }

        System.out.print("\nRearranged array : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
}
