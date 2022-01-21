package restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private int category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, int category, Date dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isItemNew();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
