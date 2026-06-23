package Day_3;

import java.util.*;
public class MoneyWithdrawal {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter available balance : ");
        int balance = scanner.nextInt();
        System.out.print("Enter the amount to withdraw : ");
        int withdrawAmount = scanner.nextInt();
        if(balance>=0) {
            if (withdrawAmount > 0) {
                if (withdrawAmount <= balance) {
                    if (withdrawAmount % 100 == 0) {
                        int currentBalance = balance - withdrawAmount;
                        System.out.println("Withdrawal successful");
                        System.out.println("Remaining balance : " + currentBalance);
                    } else
                        System.out.println("Amount should be multiple of 100");
                } else
                    System.out.println("Insufficient Balance");
            } else
                System.out.println("Invalid amount. Enter valid amount");
        }
        else
            System.out.println("Invalid account balance");
        scanner.close();
    }

}
