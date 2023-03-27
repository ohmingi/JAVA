package week2;
import java.util.Scanner;

public class week2_3 {
	public static void main(String [] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		
		String str;
		
		do {
			System.out.print(">");
			Scanner scanner =new Scanner(System.in);
			str=scanner.nextLine();
			System.out.println(str);
		}
		while(!str.equals("q"));
		
		System.out.print("\n프로그램 종료");
	}
}
