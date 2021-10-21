package ru.mirea.task13.LinkedList;
import java.util.LinkedList;
public class LinkedLists {
    public static void main(String[] args) {
        String str1 = new String("Hello!");
        String str2 = new String("Hi!");
        String str3 = new String("Bonjour!");
        String str4 = new String("Privet!");

        LinkedList<String> hello = new LinkedList<>();
        hello.add(str1);
        hello.add(str2);
        hello.add(str3);
        hello.add(str4);
        System.out.println(hello);
        hello.remove(0);
        hello.addFirst(str4);
        System.out.println(hello);

    }
}
