package ru.mirea.task5;

public class TestDish {
    public static void main(String[] args) {
        Dish.Mug mug = new Dish.Mug();
        mug.drink();

        Dish.Knife knife = new Dish.Knife();
        knife.cut();
    }
}
