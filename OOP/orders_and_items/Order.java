import java.util.ArrayList;

public class Order {
    //attributes
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;


    public Order() {
        this.name = "customer";
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public void displayOrder() {
        System.out.println ("Order for " + this.name);
        System.out.println("Item(s):");
        this.total = 0.0;
        for (Item item : this.items) {
            System.out.println(item.getName() + "-" + item.getPrice());
            this.total += item.getPrice();
        }
        System.out.println("Total: $" + this.total);
        System.out.println("Order Status: " + this.ready + "\n");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
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