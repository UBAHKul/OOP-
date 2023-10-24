import controller.Controller;
import data.*;
import view.View;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Взять проект из первого дз и сделать рефакторинг в паттерне MVC
 * Формат сдачи: ссылка на гитхаб проект
 *
 * Создать наследника реализованного класса ГорячийНапиток с
 * дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
 * и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
 * выдающий продукт соответствующий имени, объёму и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
 * и воспроизвести логику, заложенную в программе
 * Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/
public class Main {
    public static void main(String[] args) {
        // Создадим модель - у нас это Кофе-машина
        HotDrinkVendingMachine model  = new HotDrinkVendingMachine();

        // Создадим новое представление
        View view = new View();

        // свяжем модель(кофе-автомат) с представлением с помощью контроллера
        Controller controller = new Controller(model, view);

        // создадим несколько продуктов с помощью контроллера
        controller.createDrink("Эспрессо", 200, 60);
        controller.createDrink("Американо", 350, 70);
        controller.createDrink("Каппучино", 300, 80);
        controller.createDrink("Латте", 250, 65);

        // выведем с помощью представления
        view.printDetails(model.getProducts());

        // поиск и вывод с помощью view
        view.printFound("Латте", 250, 65, model);

        // поиск продукта с помощью контроллера
        controller.printFoudProduct("Латте", 25, 65);
    }
}