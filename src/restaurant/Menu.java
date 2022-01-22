package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> menu;

    public Menu(LocalDate lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.menu = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = LocalDate.parse(lastUpdated);
    }

    public ArrayList getMenu() {
        return menu;
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
        lastUpdated = LocalDate.now();
    }

    public void removeMenuItem(String name) {
        for (int i = 0; i < menu.size(); i++) {
            if (name.equals(menu.get(i).getName())) {
                menu.remove(i);
            }
        }
        lastUpdated = LocalDate.now();
    }

    private LocalDate lastUpdated() {
        return lastUpdated;
    }

    public void printWholeMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i).toString());
        }

    }
}
