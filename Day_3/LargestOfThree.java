package Day_3;

import java.util.*;
public class LargestOfThree {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a =scanner.nextInt();
        System.out.print("Enter the value of b : ");
        int b =scanner.nextInt();
        System.out.print("Enter the value of c : ");
        int c =scanner.nextInt();
        if(a == b && a == c)
            System.out.println("All numbers are equal");
        else if(a>b && a>c)
            System.out.println("Largest element = "+a);
        else if(b>c)
            System.out.println("Largest element = "+b);
        else
            System.out.println("Largest element = "+c);

        scanner.close();
    }

}
