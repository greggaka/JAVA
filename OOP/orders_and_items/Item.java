public class Item {
    public String name;
    public double price;

    //zero argument constructor
    public Item(){}

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //methods
    public String getName() {
        String output = this.name;
        return output;
    }

    public double getPrice () {
        return this.price;
    }

}