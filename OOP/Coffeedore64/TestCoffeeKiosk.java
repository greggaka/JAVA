import java.util.ArrayList;
public class TestCoffeeKiosk {
    public static void main(String[] args) {

        //Menu Items
        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 5.25);
        Item item3 = new Item("drip coffee", 4.75);
        Item item4 = new Item("cappucino", 5.5);

        //added items to an instance of a CoffeeKiosk menu
        CoffeeKiosk starbucks = new CoffeeKiosk();
        starbucks.addMenuItem(item1);
        starbucks.addMenuItem(item2);
        starbucks.addMenuItem(item3);
        starbucks.addMenuItem(item4);

        starbucks.newOrder();
    }
}