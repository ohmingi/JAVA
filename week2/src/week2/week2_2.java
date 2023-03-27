package week2;
import java.util.Scanner;

public class week2_2 {
	public static void main(String [] args) {
		int [] intArray; int sum=0;
		intArray=new int[5];
		
		System.out.print("5개의 정수를 입력하세요: ");
		
		Scanner scanner = new Scanner(System.in); 
		for(int i=0;i<intArray.length;i++) {
			int n=scanner.nextInt();
			sum += n;
		}
		
		System.out.print("평균은 "+ (double)sum/intArray.length);
		
	}
}
