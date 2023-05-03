package week10;

import javax.swing.*;
import java.awt.*;

class My extends JFrame{
    My(){
        setTitle("Ten Color Button Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new BorderLayout());

        JPanel n= new JPanel();
        n.setLayout(new FlowLayout());
        n.setBackground(Color.LIGHT_GRAY);
        n.add(new JLabel("Enter formula"));
        n.add(new JTextField(15));

        c.add(n,BorderLayout.NORTH);
        c.add(new Centerpanel(),BorderLayout.CENTER);
        c.add(new Southpanel(),BorderLayout.SOUTH);


        setSize(500,500);
        setVisible(true);
    }
}

class Centerpanel extends JPanel{
    public Centerpanel(){
        setLayout(new GridLayout(4,4,10,10));
        for(int i=0;i<10;i++){
            add(new JButton(Integer.toString(i)));
        }
        add(new JButton("CE"));
        add(new JButton("RUN"));
        JButton[]btns={new JButton("+"), new JButton("-"),new JButton("x"),new JButton("/")};
        for(int i=0;i<4;i++){
            btns[i].setBackground(Color.cyan);
            add(btns[i]);
        }
    }
}

class Southpanel extends JPanel{
    public Southpanel(){
        setLayout(new FlowLayout());
        setBackground(Color.yellow);
        add(new JLabel("Result"));
        add(new JTextField(15));
    }
}

public class week10_2 {
    public static  void main(String[]args){
        new My();
    }
}
