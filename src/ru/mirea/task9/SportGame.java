package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SportGame extends JFrame {

    private int milanScore=0;
    private int madridScore=0;

    JPanel[] pnl = new JPanel[3];
    JButton btn1 = new JButton("Milan");
    JButton btn2 = new JButton("Madrid");
    JLabel lbl1 = new JLabel("Result: 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: DRAW");

    public SportGame(){

        super("Milan vs. Madrid");
        setSize(400,400);
        setLayout(new GridLayout(1,3));

        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        pnl[0].setLayout(new BorderLayout());
        pnl[0].add(btn1, BorderLayout.CENTER);

        pnl[2].setLayout(new BorderLayout());
        pnl[2].add(btn2, BorderLayout.CENTER);

        pnl[1].setLayout(new FlowLayout());
        pnl[1].add(lbl1);
        pnl[1].add(lbl2);
        pnl[1].add(lbl3);


        btn1.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                milanScore++;
                lbl1.setText("Result: " + milanScore + " X " + madridScore);
                lbl2.setText("Last Scorer: Milan");
                if (milanScore > madridScore)
                    lbl3.setText("Winner: Milan");
                else if (madridScore > milanScore)
                    lbl3.setText("Winner: Madrid");
                else
                    lbl3.setText("Winner: DRAW");
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        btn2.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                madridScore++;
                lbl1.setText("Result: " + milanScore + " X " + madridScore);
                lbl2.setText("Last Scorer: Real Madrid");
                if (milanScore > madridScore)
                    lbl3.setText("Winner: AC Milan");
                else if (madridScore > milanScore)
                    lbl3.setText("Winner: Real Madrid");
                else
                    lbl3.setText("Winner: DRAW");
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }

    public static void main(String[]args)
    {
        new SportGame().setVisible(true);
    }
}



