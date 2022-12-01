import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        //Menu Items
        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 5.25);
        Item item3 = new Item("drip coffee", 4.75);
        Item item4 = new Item("cappucino", 5.5);

        //Order variables -- order1, order2, etc
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");


        //Application Simulations
        order1.addItem(item3); //drip coffee, 4.75
        //Print Order 1 variable
        order1.displayOrder();

        //Predict Order 1.total (should equal 0.0)

        //Add item1 to orders2's item
        order2.addItem(item1);
        //Add item4 (cappucino, 5.5) to order3
        order3.addItem(item4);
        //Add item2 (latte, 5.25) to order4
        order4.addItem(item2);
        //Update order1 status to ready
        order1.setReady(true);
        //Sam (order4) orders 2 more lattes (item2).
        order4.addItem(item2);
        order4.addItem(item2);
        //Jimmy's order (order2) is ready 
        order2.setReady(true);
        
        //Display All Orders
        order1.displayOrder();
        order2.displayOrder();
        order3.displayOrder();
        order4.displayOrder();
    }
}