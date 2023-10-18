package data;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrink> products;

    public HotDrinkVendingMachine(){
        products = new ArrayList<HotDrink>();
    }

    public void addProduct(String name, int volume, int temperature){
        products.add(new HotDrink(name, volume, temperature));
    }

    public void addProduct(String name, int volume, int temperature, int cost){
        products.add(new HotDrink(name, volume, temperature, cost));
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (int i = 0; i< products.size(); i++){
            HotDrink product = products.get(i);
            if (product.getName().equalsIgnoreCase(name) && product.getVolume() == volume && product.getTemperature() == temperature){
                System.out.println("Найден продукт");
                return product;
            }
        }
        System.out.println(String.format("Продукт c названием %s, обьемом %d, температурой %d не найден",
                name, volume, temperature));
        return null;
    }


    public void initProducts(List<HotDrink> newList) {
        this.products = newList;
        System.out.println(newList);
    }


    public void printProducts(){
        for (int i = 0; i< products.size(); i++){
            System.out.println(products.get(i));
        }
    }

    public List getProducts(){
        return this.products;
    }

    @Override
    public String toString() {
        return "HotDrinkVendingMachine{" +
                "products=" + products +
                '}';
    }
}
