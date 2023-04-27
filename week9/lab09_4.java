package week9;

import java.io.*;

public class lab09_4 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        int c;
        try {
            FileInputStream fin = new FileInputStream("c:\\test\\dlwlrma.jpg");
            while ((c = fin.read()) != -1) {
            }
            fin.close();

        }
        catch (IOException e){
            System.out.println("오류");
        }

        long end= System.currentTimeMillis();
        System.out.print("FileInputStream: ");
        System.out.println(end-start+"ms");

        long start1=System.currentTimeMillis();
        int c1;
        try{
            FileInputStream src1=new FileInputStream("c:\\test\\dlwlrma.jpg");
            BufferedInputStream in=new BufferedInputStream(src1);
            while((c1=in.read())!=-1){

            }
            in.close();
        }
        catch (IOException e){
            System.out.println("오류");
        }
        long end2=System.currentTimeMillis();
        System.out.print("BufferedInputStream: ");
        System.out.print(end2-start1+"ms");
    }
}
