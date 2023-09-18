package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
        if(o1.getAllergens().size() > 0) {

        }

        return o1.getName().compareTo(o2.getName());
//        return 0;
    }
}
