package controller;

import data.HotDrink;
import data.HotDrinkVendingMachine;
import data.Product;
import view.View;

import java.util.List;

public class Controller {
    private HotDrinkVendingMachine machine;
    private View view;

    public Controller(HotDrinkVendingMachine machine, View view){
        this.machine = machine;
        this.view = view;
    }

    public void printFoudProduct(String name, int volume, int temperature){
        Product product = machine.getProduct(name, volume, temperature);
        if (product!=null){
            System.out.println(product);
        }
    }

    public HotDrinkVendingMachine getMachine(){
        return machine;
    }

    public void createGroup(List<HotDrink> drinks){
        machine.initProducts(drinks);
    }

    public void createDrink(String name, int volume, int temperature){
        machine.addProduct(name, volume, temperature);
    }

    public void createDrink(String name, int volume, int temperature, int cost){
        machine.addProduct(name, volume, temperature, cost);
    }

    public void printInfo(){
        System.out.println(machine);
    }

    public void updateView(){
        view.printDetails(machine.getProducts());
    }

    @Override
    public String toString() {
        return "Controller{" +
                "machine=" + machine +
                '}';
    }
}
