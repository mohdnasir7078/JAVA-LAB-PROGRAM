
/*Write a java program to create a class named 'Bank
with the following data members:
Name of depositor
Address of depositor
Account Number
Balance in account
Class 'Bank' has a method for each of the following: 
1-Generate a unique accountnumberfor each depositor
For first depositor, account numberwill be 1001,for
second depositor it will be 1002 and so on
2-Display information and balance of depositor 
3- Deposit more  amount in balance of any depositor 
4-Withdraw some amount from balance deposited 
5-Change address of depositor */
import java.util.Scanner;

public class Bank10 {
    String NameDepositer;
    String AddressOfDepositer;
    int AccountNumber = 1000;
    float BalanceInAccount;

    static int count = 1;

    Bank10() {
        AccountNumber = AccountNumber + count;
        count++;
    }

    void ChangeAddress(String address) {
        AddressOfDepositer = address;
        System.out.println("Address Successfully Change");
    }

    void GetInformation() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Account Holder Name :");
        NameDepositer = obj.nextLine();
        System.out.print("Enter Address Of Account Holder :");
        AddressOfDepositer = obj.nextLine();
        System.out.print("Enter Balance in Account :");
        BalanceInAccount = obj.nextFloat();
    }

    void WithdrawAmount(float amount) {
        if (amount <= BalanceInAccount) {
            BalanceInAccount = BalanceInAccount - amount;
            System.out.println("Amount Successfully Withdrawal.");
            System.out.println("Available Balance is :" + BalanceInAccount);
        } else
            System.out.println("Amount is Invalid.");

    }

    void DepositeAmount(float amount) {
        BalanceInAccount = BalanceInAccount + amount;
        System.out.println("Amount Successfully Deposite.");
        System.out.println("Available Balance is :" + BalanceInAccount);
    }

    void DisplayInformation() {
        System.out.println("Account Number is :" + AccountNumber);
        System.out.println("Name Of Account Holder is :" + NameDepositer);
        System.out.println("Address of Account Holder is :" + AddressOfDepositer);
        System.out.println("Available Balance is :" + BalanceInAccount);
    }

    public static void main(String[] args) {
        int customers, i;
        float amount;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter No of Customers :");
        customers = obj.nextInt();
        Bank10 arr[] = new Bank10[customers];
        for (i = 0; i < customers; i++) {
            arr[i] = new Bank10();
            System.out
                    .println("********************Please Enter Customer " + (i + 1) + " Details********************");
            arr[i].GetInformation();
        }
        while (true) {
            int choice, accnumber, condition;
            System.out.println("Choice a Option.");
            System.out.println("1. For Show the Information");
            System.out.println("2. For Deposite the Amount.");
            System.out.println("3. For Withdrwal the Amount.");
            System.out.println("4. For Change the Address.");
            choice = obj.nextInt();
            System.out.print("Please Enter Customers Account Number.");
            accnumber = obj.nextInt();
            for (i = 0; i < customers; i++)
                if (arr[i].AccountNumber == accnumber)
                    break;
            if (i == customers) {
                System.out.println("Wrong Account Number Please Try Again.");
                continue;
            }
            System.out.println("Account Holder Name is :" + arr[i].NameDepositer);
            System.out.print("For Continue press 1 :");
            condition = obj.nextInt();
            if (condition != 1)
                break;
            switch (choice) {
                case 1:
                    arr[i].DisplayInformation();
                    break;
                case 2:
                    System.out.print("Please Enter Deposite Amount :");
                    amount = obj.nextFloat();
                    arr[i].DepositeAmount(amount);
                    arr[i].DisplayInformation();
                    break;
                case 3:
                    System.out.print("Please Enter withdrawal Amount :");
                    amount = obj.nextFloat();
                    arr[i].WithdrawAmount(amount);
                    arr[i].DisplayInformation();
                    break;
                case 4:
                    String str;
                    str = obj.nextLine();
                    System.out.println("Please Enter a new Address :");
                    arr[i].ChangeAddress(str);
                    arr[i].DisplayInformation();
                    break;
                default:
                    System.out.println("Choice Correct Option.");
                    break;
            }
            System.out.print("For Continue press 1 :");
            condition = obj.nextInt();
            if (condition != 1)
                break;
        }
    }
}