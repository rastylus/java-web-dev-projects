package org.launchcode;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        if (radius <= 0) {
            System.out.println("Error");
            System.exit(0);
        } else if (Double.isNaN(radius)) {
            System.out.println("Please enter a number.");
            System.exit(0);
//        } else if () {
//            System.out.println("Error");
//            System.exit(0);
        }
        Double circ = Circle.getArea(radius);
//        Double circ = radius * radius * 3.14;
        System.out.println("The area of a circle of " + radius + " is: " + circ);
    }
}
