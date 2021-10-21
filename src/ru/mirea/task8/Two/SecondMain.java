package ru.mirea.task8.Two;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SecondMain extends JFrame{
    public static void main(String[] args) throws IOException {
        String src = "";
        for (int j=0;j<args.length;j++) {
            src += args[j];
        }
        new SecondMain(src);
    }

    private String src;

    public SecondMain(String src) {
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        this.src = src;
    }

    public void paint(Graphics g) {
        Image img = new ImageIcon("/Users/User/Pictures/image1.jpg").getImage();
        g.drawImage(img, 50, 50, 300, 300, null);//выводим img
    }

    public String getSrc() {
        return src;
    }
}
