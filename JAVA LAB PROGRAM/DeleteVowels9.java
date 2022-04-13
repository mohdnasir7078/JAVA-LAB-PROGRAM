
/*Ques9. Write a java program to delete vowels from 
given string 39 using StringBuffer class*/
import java.util.Scanner;

public class DeleteVowels9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        StringBuffer str = new StringBuffer(s);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                str.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(str);
        obj.close();
    }
}