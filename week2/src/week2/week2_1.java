package week2;
import java.util.Scanner;

public class week2_1 {
	public static void main(String [] args) {
		System.out.println("양수 5개를 입력하세요.");
		
		Scanner scanner=new Scanner(System.in);
		int array []=new int [5];
		for(int i=0;i<5;i++) {
			int n=scanner.nextInt();
			array[i]=n;
		}
		
		int big=array[0];
		
		for(int i=0;i<5;i++) {
			if(array[i]>big) {
				big=array[i];
			}
		}
		
		System.out.print("가장 큰 수는 "+big+"입니다.");
	}

}
		