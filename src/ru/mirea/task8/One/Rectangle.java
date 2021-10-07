package ru.mirea.task8.One;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(Color color, int x, int y, double width, double height) {
        super(color, x, y);
        this.height=height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(X,Y,width,height);
        graphics2D.setColor(color);
        graphics2D.fill(rectangle);

    }
}
