package view;


import data.HotDrinkVendingMachine;
import data.Product;

import java.util.List;

public class View{

    public void printDetails(List list){
        for (Object object:list){
            System.out.println(object);
        }
    }

    public void printFound(String name, int volume, int temperature, HotDrinkVendingMachine machine){
        Product product = machine.getProduct(name, volume, temperature);
        if (product!=null){
            System.out.println(product);
        }
    }
}
