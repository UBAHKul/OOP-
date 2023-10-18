package data;

/**
 * Это Горячий напиток
 */
public class HotDrink extends Drink implements Comparable<HotDrink> {
    protected int temp;

    public HotDrink(String name, int volume, int temp, int cost) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public HotDrink(String name, int cost, int volume) {
        this(name, cost, volume, 50);
    }

    public HotDrink(String name, int cost) {
        this(name, cost, 200);
    }

    public HotDrink(String name) {
        this(name, 7);
    }

    public HotDrink() {
        this("Кофе");
    }

    public double getTemperature() {
        return this.temp;
    }

    @Override
    public String toString() {
        return String.format("%s temperature: %d", super.toString(), temp);
    }

    @Override
    public int compareTo(HotDrink o) {
        return Integer.compare((int) this.getTemperature(), (int) o.getTemperature());
    }
}
