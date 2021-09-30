package ru.mirea.task7.Part2;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0 ,0, 20, 20, 2 ,2);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);

        MovableCircle circle = new MovableCircle(0,0,4,5,5);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle);

    }
}
