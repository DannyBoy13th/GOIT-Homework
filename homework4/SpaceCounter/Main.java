package homework4.SpaceCounter;

import java.util.Scanner;

/**
 * Created by Daniel Solo on 10.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ShapeScanner = new Scanner(System.in);
        double h=14;
        double c=7;
        double a=5;
        double b=8;
        double r=6;
        double pi = 3.1416;
        double result;
        double result2;
        double result3;


        System.out.println("Space Counter");
        System.out.println();
        System.out.println("Please enter a shape which you would like to count (Triangle, Circle or Rectangle): ");

        if (ShapeScanner.hasNext()) {

            if (ShapeScanner.hasNext("Triangle")) {

                System.out.println("Please, print in the Height");
                if (ShapeScanner.hasNextDouble()) {
                    h = ShapeScanner.nextDouble();
                    System.out.println("Height is: " + h);
                }

                System.out.println("Please, print in Side C");
                if (ShapeScanner.hasNextDouble()) {
                    c = ShapeScanner.nextDouble();
                    System.out.println("Side c is: " + c);
                }

                result = h * c / 2;
                System.out.println("Result is: " + result);

            }


            if (ShapeScanner.hasNext("Circle")) {

                System.out.println("Please, print in the Radius of the Circle");
                if (ShapeScanner.hasNextDouble()) {
                    r = ShapeScanner.nextDouble();
                    System.out.println("Radius is: " + r);
                    }

                    result2 = r * r / pi;
                    System.out.println("Result is: " + result2);
                }

            if (ShapeScanner.hasNext("Rectangle")) {
                    System.out.println("Please print in Side A");

                if (ShapeScanner.hasNextDouble()) {
                        a = ShapeScanner.nextDouble();
                    System.out.println("Side A is: " + a);
                    }

                    System.out.println("Please print in Side B");
                if (ShapeScanner.hasNextDouble()) {
                        b = ShapeScanner.nextDouble();
                    System.out.println("Side B is: " + b);
                    }

                result3 = a * b;
                System.out.println("Result is: " + result3);

                }
            }

        }
    }

