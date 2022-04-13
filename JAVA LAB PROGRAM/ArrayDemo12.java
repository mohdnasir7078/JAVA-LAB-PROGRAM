
/*Ques12. Write a Java program to create a class called
ArrayDemo and overload arrayFunc() function
void arrayFunc(int 0, int) To find all pairs of
elements in an Array whose sum is equal to a given
number:
void arrayFunc(int AD, int p, int BO, int q)> Given
two sorted arrays A and B of size p and q, Overload
method arrayFunc() to merge elements of A with B by
maintaining the sorted order i.e. fll A with first p
smallest elements and fill B with remaining elements
Example:
Input
int[] A = { 1,5, 6,7,8, 10
int] B {2, 4, 9}
Output:
Sorted Arrays:
A:[1, 2, 4, 5,6,7]
B: [8, 9, 10]*/
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo12 {
    static void ArrayFunc(int arr[], int low, int high, int target) {
        Arrays.sort(arr);
        while (low <= high) {
            if (arr[low] + arr[high] == target) {
                System.out.println(arr[low] + " " + arr[high]);
                low++;
                high--;
            } else if ((arr[low] + arr[high]) > target)
                high--;
            else
                low++;
        }
    }

    static void ArrayFunc(int A[], int p, int B[], int q) {
        int i = 0, j = 0, k = 0;
        int temp[] = new int[p + q];
        while (i < p && j < q) {
            if (A[i] < B[j]) {
                temp[k] = A[i];
                k++;
                i++;
            } else {
                temp[k] = B[j];
                j++;
                k++;
            }
        }
        while (i < p) {
            temp[k] = A[i];
            i++;
            k++;
        }
        while (j < q) {
            temp[k] = B[j];
            j++;
            k++;
        }
        i = 0;
        j = 0;
        for (k = 0; k < (p + q); k++) {
            if (k < p) {
                A[i] = temp[k];
                i++;
            } else {
                B[j] = temp[k];
                j++;
            }
        }
    }

    static void PrintArray(int arr[], int size) {
        int i = 0;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int size, size1, size2, target, choice;
        Scanner obj = new Scanner(System.in);
        System.out.println("1. For Find Out the pairs.");
        System.out.println("2. For Merge Elements.");
        choice = obj.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Please Input Array Size :");
                size = obj.nextInt();
                System.out.println("Input Array Elements.");
                int arr[] = new int[size];
                for (int i = 0; i < size; i++)
                    arr[i] = obj.nextInt();
                System.out.print("Input target :");
                target = obj.nextInt();
                Arrays.sort(arr);
                ArrayFunc(arr, 0, size - 1, target);
            case 2:
                System.out.print("Please Input Array1 Size :");
                size1 = obj.nextInt();
                System.out.println("Input Array Elements.");
                int arr1[] = new int[size1];
                for (int i = 0; i < size1; i++)
                    arr1[i] = obj.nextInt();
                System.out.print("Please Input Array1 Size :");
                size2 = obj.nextInt();
                System.out.println("Input Array Elements.");
                int arr2[] = new int[size1];
                for (int i = 0; i < size2; i++)
                    arr2[i] = obj.nextInt();
                ArrayFunc(arr1, size1, arr2, size2);
                System.out.print("A[] :");
                PrintArray(arr1, size1);
                System.out.println("");
                System.out.print("B[] :");
                PrintArray(arr2, size2);
                break;
            default:
                System.out.println("Wrong Choice.");
                break;
        }
    }
}
