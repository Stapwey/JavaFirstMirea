package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        //создаем наш объект
        String[] countryInfo = {"Россия", "Украина", "США"};
        String[] capitalInfo = {"Москва", "Киев", "Вашингтон"};
        String[] currencyInfo = {"Рубль","Гривна","Доллар"};

        CurrencyInfo saved = new CurrencyInfo(countryInfo, capitalInfo, currencyInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\User\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем игру в файл
        objectOutputStream.writeObject(saved);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }
}
