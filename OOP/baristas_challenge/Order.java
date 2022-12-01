import java.util.ArrayList;

public class Order {
    //attributes
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    //zero argument constructor
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    //overloaded constructor
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //methods
    public String getStatusMessage () {
        if (this.ready == true) {
            return "Your order is ready!";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal () {
        double total = 0.0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display () {
        System.out.println("Customer Name: " + this.name);
        for (Item item : this.items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total: " + this.getOrderTotal());
    }

    //getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady (){
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem (Item item) {
        this.items.add(item);
    }
}