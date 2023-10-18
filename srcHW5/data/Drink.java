package data;

public class Drink extends Product {

    protected int volume;
    Drink(String name, int cost, int volume){
        super(name, cost);
        this.volume = volume;
    }

    Drink(String name, int cost){
        this(name, cost, 200);
    }

    Drink(String name){
        this(name, 5);
    }


    Drink(){
        this("Вода");
    }

    public int getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        return String.format("%s volume: %d", super.toString(), volume);
    }

    public void printInfo(){
        System.out.println("product name is " + name
                + " product cost is " +  cost);
    }
}
