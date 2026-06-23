package Day_3;
import java.util.*;
public class StudentPercentageCalculator {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int n=5;
        int total = 0;
        boolean isValid = true;

        for(int i=1;i<=n;i++)
        {
            int marks = scanner.nextInt();
            if(marks<0 || marks>100)
            {
                isValid=false;
                break;
            }
            total+=marks;
        }

        if(isValid)
        {
            int full = n*100;
            double average = (double) total /n;
            double percentage = ((double) total /full) * 100;
            System.out.println("Total : "+total);
            System.out.println("Average : "+average);
            System.out.println("Percentage : "+ percentage+"%");
        }
        else
            System.out.println("Invalid inputs");

        scanner.close();
    }
}
