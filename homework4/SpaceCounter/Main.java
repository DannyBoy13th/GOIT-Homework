package homework4.SpaceCounter;

import java.util.Scanner;

/**
 * Created by Daniel Solo on 10.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner ShapeScanner = new Scanner(System.in);
        Scanner TriangleMeter = new Scanner(System.in);
        Scanner CircleMeter = new Scanner(System.in);
        Scanner RectangleMeter = new Scanner(System.in);

        double H;
        double C;
        double A;
        double B;
        double R;
        double Pi = 3.1412;

        System.out.println("Space Counter");
        System.out.println();
        System.out.println("Please enter a shape which you would like to count (Triangle, Circle or Rectangle): ");

        if (ShapeScanner.hasNext("Triangle")){

            System.out.println("Please, print in the Height of triangle");

            if (TriangleMeter.hasNextDouble()) {
                H = TriangleMeter.nextDouble();

                System.out.println();
                System.out.println("Please, print in Side C of the triangle");
                C = TriangleMeter.nextDouble();

                System.out.println();
                System.out.println("Result is: " + H * C / 2);

            }
            }
        if (ShapeScanner.hasNext("Circle")){
            System.out.println("Please, print in radius of the circle");

            if (CircleMeter.hasNextDouble()){
                R = CircleMeter.nextDouble();

                System.out.println();
                System.out.println("Result is: " + R * R *Pi);
            }
        }
        if (ShapeScanner.hasNext("Rectangle")){
            System.out.println("Please, print in Side A of the rectangle");

            if (RectangleMeter.hasNextDouble()){
                A = RectangleMeter.nextDouble();

                System.out.println();
                System.out.println("Please, print in Side B of the rectangle");
                B = RectangleMeter.nextDouble();

                System.out.println();
                System.out.println("Result is: " + B * A);
            }
        }
        else {
            System.out.println("Wrong Shape! Start again.");
        }

        }

        }


