package presenter;

import model.Calculator;
import model.Loger;
import view.View;

import java.util.Scanner;

public class Presenter {
    private Calculator calculator;
    private View view;
    private Loger loger;
    private String results = "";

    public Presenter(Calculator calculator) {
        this.calculator = calculator;
        this.loger = new Loger();
        this.view = new View(calculator, loger);
    }

    public void start() {
        boolean flag = true;
        while (flag) {
            view.print("Калькулятор для комплексных чисел: \n" +
                    "1. Совершить операцию\n" +
                    "2. Показать предыдущие операции\n" +
                    "3. Показать данные в log-файле\n" +
                    "4. Записать текущие операции в log-файл\n" +
                    "5. Очистить log-файл\n" +
                    "6. Завершить работу\n");
            switch (view.getChoice()) {
                case "1":
                    //TODO: 1. Совершить операцию
                    String result = operation();
                    results += result + "\n";
                    view.print(result);
                    break;
                case "2":
                    //TODO: 2. Показать предыдущие операции
                    view.print("\tПоследние операции:");
                    view.print(results);
                    break;
                case "3":
                    // TODO 3. Показать операции в логе
                    view.print("\tОперации в файле:");
                    view.print(loger.read());
                    break;
                case "4":
                    //TODO: 4. Записать операции в лог-файл
                    loger.write(results);
                    results = "";
                    view.print("Последние операции перемещены в log-файл.");
                    break;
                case "5":
                    //TODO: 5. Очистка лога
                    loger.erase();
                    view.print("Log-файл очищен"); // logView
                    break;
                case "6":
                    //TODO: 6. Выйти
                    view.print("Калькулятор завершает работу"); // logView
                    flag = false;
                    break;
                default:
                    view.print("!!! Неверный выбор !!!");
                    break;
            }
        }

    }

    private String operation() {
        view.print("Введите Первое комплексное число в формате \"x y\",\n где 'х' - вещественная часть, а 'y' - комплексная: ");
        Double[] a = calculator.parse(view.get());
        String result = view.complexToString(a);
        view.print("Введите операнд: '+', '-', '*', '/'");
        char operation = view.getChoice().charAt(0);
        result += " " + operation + " ";
        view.print("Введите Второе комплексное число в формате \"x y\",\n где 'х' - вещественная часть, а 'y' - комплексная: ");
        Double[] b = calculator.parse(view.get());
        result += view.complexToString(b) + " = ";
        Double[] res = calculator.operation(operation, a, b);
        result += view.complexToString(res);
        return result;
    }
}
