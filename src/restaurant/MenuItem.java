package restaurant;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private int category;
    private boolean isNew;

    public MenuItem(double price, String description, int category, Date dateAdded) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    protected boolean isItemNew() {
        // to finish
        return true;
    }

    protected void printItem() {
        // to finish
    }
}
