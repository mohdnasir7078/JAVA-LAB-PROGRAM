
/*Ques5. Printing an array into Zigzag fashion. Suppose you 29
were given an array of integers, and you are told to
sort the integers in a zigzag pattern. In general, in a
zigzag pattern,the first integeris less than the second
integer, which is greaterthan the third integer, which is
less than the fourth integer, and so on. Hence, the
converted array should be in the form of e1 < e2> e3<
e4 e5< e6. 
Input 1
7
4 3 7 8 6 2 1
Output 1:
3 7 4 8 2 6 6 1*/
import java.util.*;

public class ZigzagFashion5 {

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
        int temp;
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.print("\nRearranged array : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }

}
