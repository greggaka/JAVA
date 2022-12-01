public class Item {
    private String name;
    private double price;

    //zero argument constructor
    public Item(){}

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getters and setters
    public String getName() {
        String output = this.name;
        return output;
    }

    public double getPrice () {
        return this.price;
    }

}