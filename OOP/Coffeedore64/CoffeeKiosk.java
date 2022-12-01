import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk () {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem (Item item) {
        this.menu.add(item);
    }

    public String displayMenu () {
        String output = "";
        for (Item item : this.menu) {
            output += item.getIndex() + " " + item.getName() + " - $" + item.getPrice() + "\n";
        }
        return output;
    }
    
    public void newOrder() {
    
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        // Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order currentOrder = new Order (name);
        System.out.println(displayMenu());
        
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            for (Item item : menu) {
                if (item.getIndex() == Integer.parseInt(itemNumber)) {
                    currentOrder.addItem(item);
                }
            }
            // Get the item object from the menu, and add the item to the order
            
            // Ask them to enter a new item index or q again, and take their input
        System.out.println("Please enter another menu item index or q to quit:");
        itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
        // as the example below. You may use the order's display method.
        currentOrder.display();

    }

}