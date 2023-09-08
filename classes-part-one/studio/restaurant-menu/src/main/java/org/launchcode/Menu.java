package org.launchcode;
import java.util.*;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;


    public void setLastUpdated(Date aLastUpdated) {
        lastUpdated = aLastUpdated;
    }

    public void setItems(ArrayList<MenuItem> aItems) {
        items = aItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}

