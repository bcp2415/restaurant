package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem toast = new MenuItem("White toast", 2.99, "Well, it's toast.  What more do you want to know?", 3, LocalDate.parse("2022-01-10"));
        MenuItem eggs = new MenuItem("Scrambled Eggs", 6.54, "Eggs that are scrambled", 3, LocalDate.parse("2022-01-01"));
        MenuItem coffee = new MenuItem("Coffee", 1.50, "Black coffee", 3, LocalDate.parse("2021-10-01"));

        Menu todaysSpecials = new Menu(LocalDate.now(), new ArrayList());

        todaysSpecials.addMenuItem(toast);
        todaysSpecials.addMenuItem(eggs);
        todaysSpecials.addMenuItem(coffee);

        todaysSpecials.printWholeMenu();

        coffee.printItem();

        todaysSpecials.removeMenuItem("Scrambled Eggs");

        todaysSpecials.printWholeMenu();
    }
}
