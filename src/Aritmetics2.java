import java.util.Scanner;

public class Aritmetics2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the cube's side's length in cm");
        int cubeSideLength = scanner.nextInt();
        int cubeVolume= cubeSideLength * cubeSideLength * cubeSideLength;
        int cubesPerimeter= cubeSideLength *12;
        System.out.println("Check" + cubeSideLength );
        System.out.println("Cube's volume " +cubeVolume+ " cm3" + " and Cube's all sides length  " + cubesPerimeter +" cm"    );


        System.out.println("Please enter inches");
        float inches = scanner.nextFloat();
        System.out.println("Please enter feet");
        float feet = scanner.nextFloat();
        float iToCm = (float) (inches*2.54);
        float fToCm = (float) (feet*12*2.54);
        float cmTotal= iToCm+fToCm;
        System.out.println(feet+" feet and " + inches +" inches = " +cmTotal +" cm");



    }
}

