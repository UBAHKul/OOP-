package data;

public abstract class Product {
    protected String name;
    protected int cost;

    Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    Product(String name){
        this(name, 5);
    }

    Product(){
        this("Хлеб");
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void printInfo(){
        System.out.println("product name is " + name
                + " product cost is " +  cost);
    }

    @Override
    public String toString() {
        return String.format("Product name: %s, cost: %d", name, cost);
    }
}
