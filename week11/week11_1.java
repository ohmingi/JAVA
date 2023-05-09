package week11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class FlyingTextEx extends JFrame {
    private final int FLYING_UNIT = 10;
    private JLabel[] la;

    public FlyingTextEx() {
        setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());

        la = new JLabel[3];
        la[0] = new JLabel("dlwlrma");
        la[1] = new JLabel("pby");
        la[2] = new JLabel("wook");

        for (int i = 0; i < la.length; i++) {
            la[i].setLocation(i * 50, i * 50);
            la[i].setSize(50, 20);
            la[i].addMouseListener(new ClickFocus());
            la[i].addKeyListener(new MyKeyListener());
            c.add(la[i]);
        }

        setSize(300, 300);
        setVisible(true);

        la[1].setFocusable(true);
        la[1].requestFocus();
    }


    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            JLabel la=(JLabel)e.getSource();

            switch (keyCode) {
                case KeyEvent.VK_UP:
                    la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
                    break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
                    break;
                case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX() - FLYING_UNIT, la.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX() + FLYING_UNIT, la.getY());
                    break;
            }
        }
    }

    class ClickFocus extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            Component com = (Component)e.getSource();
            com.setFocusable(true);
            com.requestFocus();
        }
    }
}

public class week11_1 {
    public static void main(String [] args) {
        new FlyingTextEx();
    }

}