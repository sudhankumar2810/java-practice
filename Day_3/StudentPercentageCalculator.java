package Day_3;
import java.util.*;
public class StudentPercentageCalculator {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int[] marks = new int[5];
        int total = 0;
        boolean isValid = true;
        for(int i=0;i<marks.length;i++)
        {
            marks[i] = scanner.nextInt();
            if(marks[i]<0 || marks[i]>100)
            {
                isValid=false;
                break;
            }
            total+=marks[i];
        }

        if(isValid)
        {
            int full = marks.length*100;
            double average = (double) total /marks.length;
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
