package org.launchcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
//        Comparator comparator = new FlavorComparator();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
//        flavors.sort(comparator);
        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());

        toppings.sort(new ToppingComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

//        System.out.println(toppings);
        for (Flavor t : flavors) {
            System.out.println(t);
        }
        for (Cone t : cones) {
            System.out.println(t);
        }
        for (Topping t : toppings) {
            System.out.println(t);
        }

    }
}