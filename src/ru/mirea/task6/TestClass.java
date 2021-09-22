package ru.mirea.task6;

public class TestClass {
    public static void main(String[] args) {
        Table table = new Table(20);
        table.print();
        Chair chair = new Chair(30);
        chair.print();

        Planet mars = new Planet("Mars");
        mars.print();
        Car bmw = new Car("BMW");
        bmw.print();
    }

}
