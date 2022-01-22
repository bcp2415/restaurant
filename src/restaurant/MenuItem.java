package restaurant;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private int category;
    private LocalDate dateAdded;

    public MenuItem(String name, double price, String description, int category, LocalDate dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isItemNew() {
        LocalDate today = LocalDate.now();
        int days = Period.between(this.dateAdded, today).getDays();
        if (days <= 30) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", dateAdded=" + dateAdded +
                '}';
    }

    public void printItem() {
        System.out.println(this.name + ": " + this.description + "; Price " + this.price + "; Added on " + this.dateAdded + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price, price) == 0 && name.equals(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
