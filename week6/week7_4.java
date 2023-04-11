import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Objects;

class Student{
    private String name;
    private String birthday;
    private int tall;

    public Student(String n,String b,int t){
        this.name=n;
        this.tall=t;
        this.birthday=b;
    }

    public String print(){
        return name+" "+birthday+" "+tall+" ";
    }

    public int hashCode(){
        return Objects.hash(name,birthday,tall);
    }

    public boolean equals(Object s){
        Student st=(Student) s;
        return st.name.equals(name) && st.birthday.equals(birthday) &&st.tall==tall;
    }


}
public class week7_4 {
    public static void main(String []args){
        HashMap<Student,Integer> h=new HashMap<Student,Integer>();

        h.put(new Student("dlwlrma", "930516", 162), 10000);
        h.put(new Student("pby","900212",158), 15000);
        h.put(new Student("pby","00720",158),15000);
        h.put(new Student("dlwlrma","930516", 162),20000);

        for(Entry<Student, Integer>e:h.entrySet()){
            System.out.println(e.getKey().print()+e.getValue());
        }
    }
}
