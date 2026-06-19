import java.util.*;

public class Variables
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = s.nextLine();
        System.out.print("Enter your age : ");
        int age = s.nextInt();
        s.nextLine();
        System.out.print("Enter your gender : ");
        String gender = s.nextLine();
        System.out.print("Enter your domain : ");
        String domain = s.nextLine();
        System.out.print("Are you a student? : ");
        boolean isStudent = s.nextBoolean();

        System.out.println("My Details : ");
        System.out.println("My Name : "+name);
        System.out.println("My Age : "+age);
        System.out.println("My Gender : "+gender);
        System.out.println("My Domain : "+domain);
        if(isStudent)
            System.out.println("Am I a student? : Yes");
        else
            System.out.println("Am I a student? : No");

    }

}
