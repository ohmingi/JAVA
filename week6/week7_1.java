import java.util.Vector;
import java.util.Iterator;

class Point{
    private int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void print(){
        System.out.println("("+x+","+y+")");
    }
}
public class week7_1 {

    public static  void  main(String[]args){
        Vector<Point>v=new Vector<Point>();

        Point p1=new Point(5,16);
        Point p2=new Point(2,12);
        Point p3=new Point(11,4);

        v.add(p1);
        v.add(p2);
        v.add(p3);

        Iterator<Point> it=v.iterator();

        while(it.hasNext()){
            it.next().print();
        }
    }
}
