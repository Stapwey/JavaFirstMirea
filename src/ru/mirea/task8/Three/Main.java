package ru.mirea.task8.Three;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        for(int i=0; i<3; i++) {
            Image img = new ImageIcon("/Users/User/Pictures/png-clipart-snoopy1.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            img = new ImageIcon("/Users/User/Pictures/png-clipart-snoopy2.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            img = new ImageIcon("/Users/User/Pictures/png-clipart-snoopy3.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            img = new ImageIcon("/Users/User/Pictures/png-clipart-snoopy4.png").getImage();
            g.drawImage(img, 50, 50, 300, 300, null);//выводим img
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

