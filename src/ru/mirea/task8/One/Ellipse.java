package ru.mirea.task8.One;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ellipse extends Shape {
    private double height;
    private double width;

    public Ellipse(Color color, int x, int y, double width, double height) {
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
        Ellipse2D.Double ellipse = new Ellipse2D.Double(X,Y,width,height);
        graphics2D.setColor(color);
        graphics2D.fill(ellipse);

    }
}
