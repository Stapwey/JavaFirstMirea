package ru.mirea.task29;
import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo saved = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(saved);
    }
}
