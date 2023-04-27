package week9;

import java.io.*;

public class lab09_3 {
    public  static void  main(String[]args){
        File f=new File("c:\\test");
        File[]subfile=f.listFiles();

        for(int i=0;i< subfile.length;i++) {
            if (subfile[i].isFile()) {
                FileReader fin = null;
                int c;
                try {
                    String s = subfile[i].getName();
                    System.out.println("<" + s + ">");
                    fin = new FileReader(subfile[i]);
                    BufferedOutputStream out = new BufferedOutputStream(System.out, 20);
                    while ((c = fin.read()) != -1) {
                        out.write(c);
                    }

                    out.flush();
                    System.out.println();
                } catch (IOException e) {
                    e.printStackTrace();
                    ;
                }
            }
        }
    }
}
