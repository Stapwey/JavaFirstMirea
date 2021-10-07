package ru.mirea.task8.One;
import java.awt.*;

public abstract class Shape {

    protected Color color;
    protected int X;
    protected int Y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.X = x;
        this.Y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    abstract void draw(Graphics graphics);

}
