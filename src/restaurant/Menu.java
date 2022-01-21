package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menu;

    public Menu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList getMenu() {
        return menu;
    }

    public void setMenu(ArrayList menu) {
        this.menu = menu;
    }

    protected void addMenuItem(MenuItem item) {
        // to finish
    }

    protected void removeMenuItem(MenuItem item) {
        // to finish
    }

    protected boolean isItemNew(MenuItem item) {
        // to finish
        return true;
    }

    //protected Date lastUpdated() {
        // to finish

    //}

    protected void printItem(MenuItem item) {
        // to finish
    }

    protected void printWholeMenu(Menu menu) {
        // to finish
    }

    //protected boolean equals(Object ToBeCompared) {
        // to finish
    //}
}
