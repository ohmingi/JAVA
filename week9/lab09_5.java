package week9;

import java.io.*;

public class lab09_5 {
    public static void main(String[]args){
        File src =new File("c:\\test\\dlwlrma.jpg");
        File src1=new File("c:\\test\\dlwlrma_copy.jpg");
        int c;

        FileInputStream fi=null;
        FileOutputStream fout=null;
        BufferedInputStream in=null;
        BufferedOutputStream out=null;

        long start=System.currentTimeMillis();
        try{
           fi=new FileInputStream(src);
           in=new BufferedInputStream(fi,1024*64);
           fout=new FileOutputStream(src1);
           out=new BufferedOutputStream(fout,1024*64);
           while((c=in.read())!=-1){
               out.write(c);
            }
        }
        catch (IOException e){
            System.out.println("오류");
        }
        long end=System.currentTimeMillis();

        System.out.println(end-start+"ms");
    }
}
