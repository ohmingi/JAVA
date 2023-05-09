package week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class MyFrame extends JFrame{
    JLabel la=new JLabel("Love Java");

    public MyFrame(){
        setTitle("Wheel your mouse");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int n=e.getWheelRotation();
                if(n>0) zoomOut();
                else zoomIn();
            }
        });

        la.setFont(new Font("Arial",Font.PLAIN,15));
        c.add(la);

        setSize(500,150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    void zoomOut(){
        Font f=la.getFont();
        int size=f.getSize();
        if(size<=5) return;
        la.setFont(new Font("Arial",Font.PLAIN,size-5));
    }

    void zoomIn(){
        Font f=la.getFont();
        int size=f.getSize();
        la.setFont(new Font("Tjimes New Roman",Font.BOLD|Font.ITALIC,size+5));
    }
}

public class week11_2 {

    public static void main(String[]args){
        new MyFrame();
    }
}
