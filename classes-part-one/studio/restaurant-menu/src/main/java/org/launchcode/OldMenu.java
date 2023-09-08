package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class OldMenu {
    private Date lastUpdated;
    private ArrayList<OldMenuItem> items;

    public OldMenu(Date d, ArrayList<OldMenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<OldMenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<OldMenuItem> getItems() {
        return items;
    }
}
