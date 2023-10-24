package model;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Loger {
    File file = new File("log.txt");
    FileWriter writer;
    BufferedReader reader;

    public Loger() {
    }

    public void write(String expression) {

        try {
            if (file.exists()) {
                this.writer = new FileWriter(file, true);
            } else this.writer = new FileWriter(file);
            writer.write(expression + '\n');
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void erase() {
        Scanner s = new Scanner("log.txt");
        Formatter f = null;
        try {
            f = new Formatter("log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (s.hasNext()) {
            f.format("");
            s.next();
        }
    }

    public String read() {
        String result = "";
        try {
            this.reader = new BufferedReader(new FileReader(file));
            while (true) {
                String temp = reader.readLine();
                if (temp == null) break;
                result += temp + "\n";
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


}
