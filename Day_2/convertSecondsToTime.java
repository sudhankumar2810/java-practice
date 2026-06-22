package Day_2;

import java.util.*;
public class convertSecondsToTime {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the seconds : ");
        int seconds = scanner.nextInt();
        int hours =0;
        int minutes = 0;
        int sec = 0;
        if(seconds>=0 && seconds<=1000000) {

                hours=seconds/3600;
                minutes=(seconds%3600)/60;
                sec=(seconds%3600)%60;

            System.out.println(hours+" hours");
            System.out.println(minutes+" minutes");
            System.out.println(sec+" seconds");
        }
        else
            System.out.println("Invalid input for seconds");


    }



}
