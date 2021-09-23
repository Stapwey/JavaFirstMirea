package ru.mirea.task3;

public class TestHuman {
    public static void main(String[] args) {
        Human aleks = new Human();
        aleks.setName("Александр");
        System.out.println(aleks.getName());
        aleks.setAge(60);
        System.out.println(aleks.toString());
    }
}
