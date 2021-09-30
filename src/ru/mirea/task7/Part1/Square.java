package ru.mirea.task7.Part1;

import ru.mirea.task7.Part1.Rectangle;

public class Square extends Rectangle {
    public Square(){};
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return length;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }

    public void setWidth(double width) {
        super.setWidth(width);
    }
    public void setLength(double length) {
        super.setLength(length);
    }
    public String toString() {
        return super.toString();
    }
}
