package Day_1;

import java.util.*;

public class ArithmeticOperations
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Maths mark : ");
        int math = s.nextInt();
        System.out.print("Enter English mark : ");
        int english = s.nextInt();
        System.out.print("Enter Science mark : ");
        int science = s.nextInt();

        if((math>=0 && math<=100) && (science>=0 && science<=100) && (english>=0 && english<=100) )
        {
           int total = math+english+science;
           System.out.println("Total marks : "+total);
           double average = (double) total /3;
           System.out.println("Average of these marks is : "+average);
        }
        else
            System.out.println("Invalid marks");
    }


}
