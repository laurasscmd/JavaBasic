import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String name = scanner.nextLine();
        System.out.println("Please enter your Last Name");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your Age");
        int age = scanner.nextInt();
        System.out.println("Hello I am " + name +" "+ lastName +". My age " + age +". I am attending GYK 2022");


        byte zero = 0;
        short a = 3;
        int b = 1;
        char d = ' ';
        float e = 2.0f;
        boolean f = true;
        String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
        System.out.println(output);
    }
}