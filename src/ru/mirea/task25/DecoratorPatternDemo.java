package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Начать рисовать прямоугольник с черной рамкой");
        rectangle.draw();
        System.out.println("Начать рисовать круг с красной рамкой");
        redCircle.draw();
        System.out.println("Начать рисовать круг с красной рамкой");
        redRectangle.draw();
    }
}