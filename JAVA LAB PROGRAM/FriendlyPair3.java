
/*Ques3. Program to find if the given numbers are Friendly pair 
or not (Amicable or not). Friendly Pair are two or more
numbers with a common abundance.
(Sum of divisors of 6)/6 (Sum of divisors of 28)/28
Program to check whether the given numbers are
friendly pair or not*/
import java.util.Scanner;

public class FriendlyPair3 {
    void AbundantNumber() {
        int number1, number2, sum1 = 0, sum2 = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Input number 1: ");
        number1 = obj.nextInt();
        System.out.print("Input number 1: ");
        number2 = obj.nextInt();
        int i = 1;
        while (i <= (number1) / 2) {
            if (number1 % i == 0)
                sum1 = sum1 + i;
            i++;
        }
        i = 1;
        while (i <= (number2) / 2) {
            if (number2 % i == 0) {
                sum2 = sum2 + i;
            }
            i++;
        }

        if ((sum1 == number1) && (sum2 == number2))
            System.out.println("Abundant Numbers");
        else
            System.out.println("Abundant Numbers");
        obj.close();
    }

    public static void main(String[] args) {
        FriendlyPair3 ClassObject = new FriendlyPair3();
        ClassObject.AbundantNumber();
    }
}
