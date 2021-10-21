package ru.mirea.task13.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        int a;
        for (int i = 0; i<10;i++){
            a = rand.nextInt(100);
            list.add(a);
            System.out.print(a+" ");
        }
    }
}
