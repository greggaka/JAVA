public class Item {
    private static int idx;
    private String name;
    private double price;
    private int index;

    //zero argument constructor
    public Item(){
        this.name = "Drink";
        this.price = 0.0;
        this.index = idx;
        idx++;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.index = idx;
        idx++;
    }

    //getters and setters
    public String getName() {
        String output = this.name;
        return output;
    }

    public double getPrice () {
        return this.price;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}