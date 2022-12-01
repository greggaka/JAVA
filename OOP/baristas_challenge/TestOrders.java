import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        //Menu Items
        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 5.25);
        Item item3 = new Item("drip coffee", 4.75);
        Item item4 = new Item("cappucino", 5.5);

        //Create 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();
        
        //Create 4 orders using the overloaded constructor
        Order order3 = new Order("John");
        Order order4 = new Order ("Jimmy");
        Order order5 = new Order ("Jane");

        //Add 2 items to each order
        order3.addItem(item2);
        order3.addItem(item3);
        order4.addItem(item1);
        order4.addItem(item4);
        order5.addItem(item4);

        //Set item ready status
        order5.setReady(true);
        order4.setReady(false);
        order3.setReady(false);
        

        //Display all orders
        //Test getOrderTotal
        //Test getStatusMessage
        order3.display();
        System.out.println(order3.getStatusMessage());
        System.out.println(order3.getOrderTotal());
        order4.display();
        System.out.println(order4.getOrderTotal());
        System.out.println(order4.getStatusMessage());
        order5.display();
        System.out.println(order5.getOrderTotal());
        System.out.println(order5.getStatusMessage());
    }
}