package org.launchcode;

import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();






    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


    @Override
    public String toString() {
        StringBuilder app =new StringBuilder();
            for (MenuItem item : menuItems) {
                if (item.getCategory().equals("app")) {
                    app.append("\n").append(item.toString()).append("\n");
                }
            }
        StringBuilder entree =new StringBuilder();
            for (MenuItem item : menuItems) {
                if (item.getCategory().equals("entree")) {
                    entree.append("\n").append(item.toString()).append("\n");
                }
            }
       StringBuilder dessert =new StringBuilder();
            for (MenuItem item : menuItems) {
                if (item.getCategory().equals("dessert")) {
                    dessert.append("\n").append(item.toString()).append("\n");
                }
            }
            return "\nRANDOS FOOD SELECTION\n" +
                    "Apps" + app.toString() + "\n" +
                    "Entree" + entree.toString() + "\n" +
                    "Dessert" + dessert.toString() + "\n";
    }

    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }


}


