package com.company;

import restaurant.Menu;
import restaurant.MenuItem;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        MenuItem toast = new MenuItem(3.25, "Toast", 0, true);
        ArrayList<MenuItem> ourMenu = new ArrayList<MenuItem>();
        ourMenu.add(toast);

        Menu testMenu = new Menu(ourMenu);

        System.out.println(toast.getPrice());
        System.out.println(toast.getDescription());

        System.out.println(testMenu.getMenu());
    }
}
