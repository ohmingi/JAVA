package week9;

import java.io.*;
import java.util.Scanner;
import java.lang.String;

public class lab09_2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        FileOutputStream fout=null;
        OutputStreamWriter f=null;
        try{
            fout=new FileOutputStream("c:\\test\\test3.txt");
            f= new OutputStreamWriter(fout,"UTF-8");
            while (true) {
                String line = scanner.nextLine();
                byte b[]= line.getBytes();
                String l="\r\n";
                byte b1[]=l.getBytes();
                if (line.length() == 0) break;
                for(int i=0;i<line.length();i++){
                    fout.write(b[i]);
                }
                for(int i=0;i<l.length();i++) {
                    fout.write(b1[i]);
                }
            }
            fout.close();
            f.close();
        }
        catch (IOException e){
            System.out.print("입출력 오류");
        }
        scanner.close();

        InputStreamReader in=null;
        FileInputStream fin=null;

        try{
            fin=new FileInputStream("c:\\test\\test3.txt");
            in =new InputStreamReader(fin,"UTF-8");
            char [] b=new char[10];
            int c;

            while((c=in.read(b)) != -1){
                System.out.print(new String(b,0,c));
            }
            in.close();
            fin.close();
        }
        catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
