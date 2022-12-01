public class Item {
    public String name;
    public double price;

    public Item(){}

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        String output = this.name;
        return output;
    }

    public double getPrice () {
        return this.price;
    }

}