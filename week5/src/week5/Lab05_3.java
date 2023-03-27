package week5;
import java.util.Scanner;

public class Lab05_3 {
	public static void main(String [] args) {
		System.out.print("size of stack: ");
		
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		StringStack ss=new StringStack(n);
		
		while(true) {			
			System.out.print("input: ");
		
			Scanner sc=new Scanner(System.in);
			String s=scanner.next();
			
			if(s.equals("exit")) {break;}
			
			
				if(ss.push(s)) {
					
				}
				else {
					System.out.println("stack is full!");
				}
			}
			
		
			
		System.out.print("pop all strings: ");
		for(int i=0;i<n;i++) {
			System.out.print(ss.pop()+" ");
		}
		
	}
}
