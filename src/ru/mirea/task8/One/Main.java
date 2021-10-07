package ru.mirea.task8.One;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Panel(100,100));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(500,500);
        frame.setVisible(true);

    }
}
