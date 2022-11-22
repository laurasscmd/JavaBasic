package lt.gyk.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    daysToHoursAndMinutes();
   whileDaysToHoursAndMinutes();
    factorial();
    }


    public static void daysToHoursAndMinutes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter count of days");
        int hours=0;
        int minutes=0;
        int days = scanner.nextInt();
        for (int i=0; i<days;i++){
            hours+=24;
            minutes+=1440;
        }
        System.out.println(days+" days has "+hours+" hours or "+minutes+" minutes.");
    }

    public static void whileDaysToHoursAndMinutes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter count of days");
        int hours=0;
        int minutes=0;
        int i=0;
        int days = scanner.nextInt();
        while ( i<days) {
            hours += 24;
            minutes += 1440;
            i++;
        }
        System.out.println(days+" days has "+hours+" hours or "+minutes+" minutes.");
    }

    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int fact=1;
        //int minutes=0;
        int i=0;
        int number = scanner.nextInt();
        while ( i<number) {
            i++;
            fact *=i;
            //minutes += 1440;

        }
        System.out.println("Factorial of number "+ number +" is "+fact);
    }
}