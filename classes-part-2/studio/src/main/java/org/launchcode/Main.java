package org.launchcode;



public class Main {


    public Main() {
    }

    public static void main(String[] args) {
        // write your code here
        MenuItem item1 = new MenuItem("steak", "12oz ribeye with a side of mashed potatoes", 23, "entree");
        MenuItem item2 = new MenuItem("cheesecake", "new york style cheesecake with optional raspberry drizzle",
                7, "dessert");
        MenuItem item3 = new MenuItem("mozzarella sticks", "fried sticks of mozzarella cheese with marinara " +
                "dipping " +
                "sauce", 12,
                "app");
        MenuItem item4 = new MenuItem("burger", "1/4 burger with a side of fries", 17, "entree");
        MenuItem item5 = new MenuItem("wings", "buffalo drenched chicken wings", 14, "app");

//        System.out.println(item1);
        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);


        menu.removeItem(item3);
        System.out.println(menu);


        System.out.println(item1.equals(item2));

        MenuItem item6 = new MenuItem("wings", "buffalo drenched chicken " +
                "wings", 14, "app");

        System.out.println(item5.equals(item6));

    }
}

