package org.launchcode;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        Float miles = input.nextFloat();
        System.out.println("How many gallons of gas have you consumed: ");
        Float gallons = input.nextFloat();
        System.out.println("Your average is " + (miles/gallons) + "miles per gallon");
    }
}
