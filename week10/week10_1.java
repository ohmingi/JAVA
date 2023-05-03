package week10;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Myframe extends JFrame{
    public Myframe(){
        setTitle("Ten Color Button Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new GridLayout(0,10));


        for(int i=0;i<10;i++) {

            JButton btn = new JButton(Integer.toString(i));
            btn.setOpaque(true);
            btn.setBorderPainted(false);

            Random r = new Random();
            btn.setBackground(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            c.add(btn);
        }

        setSize(700,300);
        setVisible(true);
    }
}

public class week10_1 {
    public  static  void  main(String[]args){
        new Myframe();
    }
}
