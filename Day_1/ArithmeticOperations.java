package Day_1;

import java.util.*;

public class ArithmeticOperations
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = s.nextInt();
        System.out.print("Enter the second number : ");
        int b = s.nextInt();
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int divide = a / b;
        System.out.println("Sum of above two numbers are "+sum);
        System.out.println("Difference of above two numbers are "+difference);
        System.out.println("Product of above two numbers are "+product);
        System.out.println("Division of above two numbers are "+divide);

    }


}
