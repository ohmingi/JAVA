import java.util.ArrayList;
import java.util.Scanner;

public class week7_2 {
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<String>();

        while(true) {
            System.out.print("? ");
            String str = scanner.nextLine();

            if(str.equals("exit")){
                break;
            }

            arr.add(str);
        }

        int Long=arr.get(0).length();
        String it=arr.get(0);

        for(int i=0;i< arr.size();i++){
            String s=arr.get(i);
            System.out.print(s+" ");
            if(arr.get(i).length()>Long){
                it=arr.get(i);
            }
        }

        System.out.print("\nthe longest name: "+it);

    }
}
