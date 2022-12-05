package lt.gyk.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        triangle();
        car();


    }


    public static void car () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter trip distance");
        float distance = scanner.nextFloat();
        System.out.println("How much fuel in the tank?");
        float fuelLitres = scanner.nextFloat();
        System.out.println("Fuel consumption liters per 100 km ");
        float fuelLitresConsumption = scanner.nextFloat();
        System.out.println("Fuel price EUR/1L");
        float fuelPrice = scanner.nextFloat();

        float fuelForOneKm = fuelLitresConsumption / 100;

        float needFuel = distance * fuelForOneKm;

        if (needFuel <= fuelLitres) {
            float fuelInTank = fuelLitres-needFuel;
            System.out.println("Trip distance: " + distance + ". Car is able to reach destination. It will have " + fuelInTank + " liters of fuel left");
        }
        else {
            float fuelNeedToBuy=needFuel-fuelLitres;
            float fuelNeedToBuyAmount = fuelNeedToBuy*fuelPrice;
            System.out.println("Trip distance: " + distance + ". Car is not able to reach destination. It need " + fuelNeedToBuy +" liters more.It will cost " + fuelNeedToBuyAmount + ".");

        }
    }


    public static String  triangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter triangle sides");
        int sideOne = scanner.nextInt();
        int sideTwo = scanner.nextInt();
        int sideThree = scanner.nextInt();
        String result;

        if ((sideOne + sideTwo > sideThree) && (sideOne + sideThree > sideTwo) && (sideThree + sideTwo > sideOne)) {

            //System.out.println("Triangle possible");
            if ((sideOne == sideTwo) || (sideTwo == sideThree) || (sideOne == sideThree)) {
                result= "Triangle is Isosceles. Sides: " + sideOne + " " + sideTwo + " " + sideThree;
                System.out.println(result);
            }
            if ((sideOne == sideTwo) && (sideTwo == sideThree)) {
                result= "Triangle is Equilateral. Sides: " + sideOne + " " + sideTwo + " " + sideThree;
                System.out.println(result);

            } else {
                result="Triangle is Scalene. Sides: " + sideOne + " " + sideTwo + " " + sideThree;
                System.out.println(result);
            }
        }
        else {
            result="Triangle not possible. Sides: "+sideOne+" "+sideTwo+" " +sideThree +"";
            System.out.println(result);
        }

        return result;
    }

    public static String  trianglecheck(int side1, int side2, int side3){


        String result;

        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1)) {

            //System.out.println("Triangle possible");
            if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
                result= "Triangle is Isosceles. Sides: " + side1 + " " + side2 + " " + side3;
                System.out.println(result);
            }
            if ((side1 == side2) && (side2 == side3)) {
                result= "Triangle is Equilateral. Sides: " + side1 + " " + side2 + " " + side3;
                System.out.println(result);

            } else {
                result="Triangle is Scalene. Sides: " + side1 + " " + side2 + " " + side3;
                System.out.println(result);
            }
        }
        else {
            result="Triangle not possible. Sides: "+side1+" "+side2+" " +side3 +"";
            System.out.println(result);
        }

        return result;
    }
}
