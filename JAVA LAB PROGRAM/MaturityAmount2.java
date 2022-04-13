
/*Ques2. Using the switch statement, write a menu-driven 
program to calculate the maturity amount of a bank
deposit. The user is given the following options:
(i). Term Deposit
(ii).Recurring Deposit
For option (i) accept Principal (p), rate of interest()
and time period in years (n). Calculate and outpute the
maturity amount (a) receivable using the formula a =
P[1+r/ 100]n.
For option (ii) accept monthly installment (p), rate of
interest (r) and time period in months (n). Calculate
and output the maturity amount (a) receivable using the
formula a = p * n+p * n(n + 1)/2* rl 100 1/12 For an 
incorrect option, an appropriate error message
should be displayed.
TUse ScannerClassto take input]*/
import java.util.Scanner;
import java.lang.Math;

public class MaturityAmount2 {
    void TermDeposit() {
        float Principle, IntrestRate, Time;
        double Amount;
        Scanner obj = new Scanner(System.in);
        System.out.print("Input Principle :");
        Principle = obj.nextFloat();
        System.out.print("Input Intrest Rate :");
        IntrestRate = obj.nextFloat();
        System.out.print("Input Time (Years) :");
        Time = obj.nextFloat();
        Amount = Principle * Math.pow(((100 + IntrestRate) / 100), Time);
        System.out.print("Total Amount is :");
        System.out.printf("%.2f", Amount);
        obj.close();
    }

    void RecurringDeposit() {
        float MonthlyInstallment, IntrestRate, Time;
        double Amount;
        Scanner obj = new Scanner(System.in);
        System.out.print("Input Monthly Installment :");
        MonthlyInstallment = obj.nextFloat();
        System.out.print("Input Intrest Rate :");
        IntrestRate = obj.nextFloat();
        System.out.print("Input Time (Month) :");
        Time = obj.nextFloat();
        Amount = MonthlyInstallment * Time
                + MonthlyInstallment * Time * ((Time + 1) / 2) * (IntrestRate / 100) * (1 / 12);
        System.out.print("Total Amount is :");
        System.out.printf("%.2f", Amount);
        obj.close();
    }

    public static void main(String[] args) {
        System.out.println("1. FOr Term Deposit");
        System.out.println("2. For Recuring Deposit");
        Scanner obj = new Scanner(System.in);
        int choice = obj.nextInt();
        MaturityAmount2 ClassObject = new MaturityAmount2();
        switch (choice) {
            case 1:
                ClassObject.TermDeposit();
                break;
            case 2:
                ClassObject.RecurringDeposit();
                break;
            default:
                System.out.println("Please Choice Correct Option.");
        }
        obj.close();
    }
}
