
/*Ques8. Program to find all the patterns of 0(1+)0 in the given 
string. Given a string containing 0's and 1's, find the
total number of 0(1+)0 patterns in the string and output it.
o(1+)0 There should be at least one 1' between the two 0's.
For example, consider the following string.
Input: 01101111010
Output: 3
Explanation:
01101111010 -count=1
01101111010 - count 2
01101111010- count=3*/
import java.util.*;

public class FindPatterns8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter the string : ");
        String str = obj.nextLine();
        int count = 0;
        char ch = str.charAt(0);
        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) == '1' && ch == '0') {
                while (str.charAt(i) == '1') {
                    i++;
                }
                if (str.charAt(i) == '0') {
                    count++;
                }
            }
            ch = str.charAt(i);
            i++;
        }
        System.out.println("Number of patterns found : " + count);
    }
}
