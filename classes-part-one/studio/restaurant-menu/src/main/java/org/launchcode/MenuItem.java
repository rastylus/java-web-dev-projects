package org.launchcode;

public class MenuItem {
        private double price;
        private String description;
        private String category;
        private boolean isNew = true;


    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public void setDescription(String Description) {
        this.description = description;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setNew(boolean aNew) {
        this.isNew = aNew;
    }

}
