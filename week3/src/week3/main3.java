package week3;
import java.util.Scanner;

public class main3 {
	static Scanner scan = new Scanner(System.in);
	static void closeScanner() {
		scan.close();
	}
	
	static Student2[] makeArray(int n) {	
		
		Student2[]arr=new Student2[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter your name and birth: ");
			Scanner scanner=new Scanner(System.in);
			String a=scanner.next();
			int b=scanner.nextInt();
			arr[i]=new Student2(a,b);
		}
		
		return arr;
	}
	
	static void printArray(Student2[] arr) {
		for(Student2 a:arr) {
			a.printInfor();
		}
	}
	
	public static void main(String []args) {
		int number;
		System.out.print("Enter #students: ");
		number=scan.nextInt();
		Student2[] sArr=makeArray(number);
		System.out.println();
		printArray(sArr);
		main3.closeScanner();
	}
}
