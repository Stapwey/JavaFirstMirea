package ru.mirea.task2;

public class Ball {
    private String color;
    private int radius;
    public Ball(String n, int a)
    {
        color = n;
        radius = a;
    }
    public Ball()
    {
        color = "Brown";
        radius = 0;
    }
    public Ball(String n)
    {
        color = n;
        radius = 0;
    }


    public void setRad(int radius)
    {
        this.radius=radius;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor(String color)
    {
        return color;
    }
    public int getRad(int radius)
    {
        return radius;
    }
    public String toString()
    {
        return this.color +", radius "+ this.radius;
    }

}
