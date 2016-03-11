package com.goit.homework4.SpaceCounter;

import java.util.Scanner;

/**
 * Created by Daniel Solo on 10.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner ShapeScanner = new Scanner(System.in);
        double a, b, c, h, r, result, result2, result3;


        System.out.println("Space Counter");
        System.out.println();
        System.out.println("Please enter a shape which you would like to count (Triangle, Circle or Rectangle): ");

        while (ShapeScanner.hasNext()) {

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


                if (ShapeScanner.hasNext("Circle")) {

                    System.out.println("Please, print in the Radius of the Circle");
                    if (ShapeScanner.hasNextDouble()) {
                        r = ShapeScanner.nextDouble();
                        System.out.println("Radius is: " + r);
                    }

                    result2 = r * r / 3.14;
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
}
