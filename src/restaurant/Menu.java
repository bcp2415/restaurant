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
}
