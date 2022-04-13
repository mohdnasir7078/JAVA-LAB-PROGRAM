
/*Ques4. Program to replace al 0's with 1 in a given integer. 
Given an integer as an input, all the 0's in the number
has to be replaced with 1.
For example, consider the following number
Input: 102405
Output: 112415
Input: 56004
Output: 56114
Steps to replace all 0's with 1 in a given integer*/
import java.util.Scanner;

public class Convert0In14 {
    void Replace0And1() {
        int number;
        Scanner obj = new Scanner(System.in);
        System.out.print("Input a number :");
        number = obj.nextInt();
        String str = Integer.toString(number);
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (ch[i] == '0')
                ch[i] = '1';
            System.out.print(ch[i]);
        }
        obj.close();
    }

    public static void main(String[] args) {
        Convert0In14 ClassObject = new Convert0In14();
        ClassObject.Replace0And1();
    }
}
