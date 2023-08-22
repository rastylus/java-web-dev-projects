package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        Double circ = Circle.getArea(radius);
//        Double circ = radius*radius*3.14;
        System.out.println("The area of a circle of " + radius + " is: " + circ);
    }
}
