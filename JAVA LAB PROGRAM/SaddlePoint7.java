
/*Ques7. Program to find the saddle point coordinates in a 
given 34 matrix. A saddle point is an element of the matrix,
which is the minimum element in its row and the maximum in 
its column.
Mat[3]13]
1 2 3
4 5 6
7 8 9
Here, 7 is the saddle point because it is the minimum
element in its row and maximum element in its column*/
import java.util.*;

public class SaddlePoint7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int row = input.nextInt();
        System.out.print("Enter no of columns : ");
        int column = input.nextInt();
        int[][] arr = new int[row][column];
        System.out.println("Enter elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int min = 0, max = 0;
        int position[][] = { { 0, 0 }, { 0, 0 } };
        int i, j, k;
        for (i = 0; i < row; i++) {
            min = arr[i][0];
            for (j = 0; j < column; j++) {
                if (min >= arr[i][j]) {
                    min = arr[i][j];
                    position[0][0] = i;
                    position[0][1] = j;
                }
            }
            j = position[0][1];
            max = arr[0][j];
            for (k = 0; k < row; k++) {
                if (max <= arr[k][j]) {
                    max = arr[i][j];
                    position[1][0] = k;
                    position[1][1] = j;
                }
            }
            if (min == max) {
                if (position[0][0] == position[1][0] && position[0][1] == position[1][1]) {
                    System.out.println("Saddle Point (" + position[0][0] + "," + position[0][1] + ") : " + min);
                }
            }

        }

    }
}
