package Day_1;

import java.util.*;

public class Variables
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your employee id : ");
        int id = s.nextInt(); s.nextLine();
        System.out.print("Enter your name : ");
        String name = s.nextLine();
        System.out.print("Enter your age : ");
        int age = s.nextInt();
        s.nextLine();
        System.out.print("Enter your salary : ");
        double salary = s.nextDouble(); s.nextLine();
        System.out.print("Are you a permanent employee? : ");
        boolean isPermanentEmployee = s.nextBoolean();

        System.out.println("Employee Details : ");
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
        if(age>0)
            System.out.println("Age = "+age);
        else
            System.out.println("Invalid age");
        if(salary>0)
            System.out.println("Salary = "+salary);
        else
            System.out.println("Invalid salary");
        System.out.println("Permanent = "+isPermanentEmployee);
    }

}
