package Day_2;

import java.util.*;
public class BankBalance {

    static double finalBalance;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = s.nextLine();
        System.out.print("Enter your account number : ");
        long accountNumber = s.nextLong();
        System.out.print("Enter current balance : ");
        double currentBalance = s.nextDouble();
        System.out.print("Enter the amount to deposit : ");
        double deposit = s.nextDouble();

        if(currentBalance>=0 && deposit>=0) {
            finalBalance = currentBalance + deposit;
            System.out.println("Name : " + name);
            System.out.println("Account number  : " + accountNumber);
            System.out.println("Current Balance : "+currentBalance);
            System.out.println("Deposit amount : "+deposit);
            System.out.println("Final balance : " + finalBalance);
        }
        else
            System.out.println("Invalid inputs");

        s.close();

    }

}
