package ru.mirea.task8.One;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Panel extends JPanel {

    private List<Object> shapes = new ArrayList<>();
    private Random random = new Random();
    private double figureHeight;
    private double figureWidth;

    public Panel(double figureWidth, double figureHeight){
        this.figureWidth = figureWidth;
        this.figureHeight = figureHeight;
        for (int i = 0; i < 20; ++i) {
            if (i % 2 == 0) {
                addRectangle();
            } else {
                addEllipse();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for (Object obj: shapes) {
            if (obj instanceof Rectangle) {
                ((Rectangle) obj).draw(graphics);
            } else if (obj instanceof Ellipse) {
                ((Ellipse) obj).draw(graphics);
            }
        }
    }

    private void addRectangle() {
        Color randomColor = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        shapes.add(new Rectangle(
                randomColor,random.nextInt(500),random.nextInt(500),random.nextInt(500), random.nextInt(500)))
    ;}

    private void addEllipse() {
        Color randomColor = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        shapes.add(new Ellipse( randomColor,random.nextInt(500),random.nextInt(500),random.nextInt(500), random.nextInt(500)));

    }
}
