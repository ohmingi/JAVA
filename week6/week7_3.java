import java.util.Iterator;
import java.util.Vector;

public class week7_3 {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>(10);
        v.add(5); // 5 삽입
        v.add(4); // 4 삽입
        v.add(-1); // -1 삽입

        v.add(2, 100);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());

        Iterator<Integer> it=v.iterator();

        int sum = 0;

        while(it.hasNext()) {
            int i=it.next();
            sum+=i;
            System.out.println(i);
        }

        System.out.println("sum: "+sum);
    }
}
